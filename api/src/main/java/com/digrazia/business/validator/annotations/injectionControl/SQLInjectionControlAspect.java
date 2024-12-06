package com.digrazia.business.validator.annotations.injectionControl;

import com.digrazia.business.exception.LengthControlException;
import com.digrazia.business.exception.SQLInjectionControlException;
import com.digrazia.business.validator.annotations.lengthControl.LengthControl;
import com.digrazia.business.validator.annotations.lengthControl.LengthControlConfiguration;
import com.digrazia.business.validator.annotations.lengthControl.PathVariableAspect;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


@Aspect
@Component
public class SQLInjectionControlAspect {
    Logger log = LoggerFactory.getLogger(PathVariableAspect.class);

    @Before("@annotation(sqlInjectionControl)")
    public void checkPathVariable(JoinPoint joinPoint, SQLInjectionControl sqlInjectionControl) {
        LengthControlConfiguration lengthControlConfiguration = new LengthControlConfiguration();
        Object[] args = joinPoint.getArgs();

        for (Object arg : args) {
            String logMessage = lengthControlConfiguration.getMessage() + ": ";
            if (arg instanceof String) {
                checkForCommand(arg.toString(), sqlInjectionControl);
                switch (sqlInjectionControl.logLevel()) {
                    case INFO:
                        log.info(logMessage + arg);
                        break;
                    case WARN:
                        log.warn(logMessage + arg);
                        break;
                    case DEBUG:
                        log.error(logMessage + arg);
                        break;
                    case ERROR:
                        log.error(logMessage + arg);
                        break;
                    default:
                        break;
                }
            } else {
                log.error(logMessage + arg);
                throw new LengthControlException("Valore PathVariable intercettato: " + arg.getClass());
            }
        }
    }

    private int getStringLength(String pathVariable) {
        return pathVariable.length();
    }

    private void checkForCommand(String pathVariable, SQLInjectionControl sqlInjectionControl) {
        String regex = "\\b(SELECT|INSERT|UPDATE|DELETE|DROP|CREATE|ALTER|EXEC|UNION|GRANT|REVOKE|TRUNCATE)\\b";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(pathVariable);
        if (matcher.find()) {
            throw new SQLInjectionControlException("Trovato comando sql " + pathVariable);
        }
    }
}
