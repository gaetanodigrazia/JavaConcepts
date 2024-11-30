package com.digrazia.business.validator.annotations.lengthControl;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class PathVariableAspect {
    Logger log = LoggerFactory.getLogger(PathVariableAspect.class);

    @Before("@annotation(lengthControl)")
    public void checkPathVariable(JoinPoint joinPoint, LengthControl lengthControl) {
        LengthControlConfiguration lengthControlConfiguration = new LengthControlConfiguration();
        Object[] args = joinPoint.getArgs();

        for (Object arg : args) {
            String logMessage = lengthControlConfiguration.getMessage() + ": ";
            if (arg instanceof String) {
                checkMaxLength(arg.toString(), lengthControl);
                switch (lengthControl.logLevel()) {
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
                throw new RuntimeException("Valore PathVariable intercettato: " + arg.getClass());
            }
        }
    }

    private int getStringLength(String pathVariable) {
        return pathVariable.length();
    }

    private void checkMaxLength(String pathVariable, LengthControl lengthControl) {
        if (lengthControl.customMaxChar() != -1) {
            if (getStringLength(pathVariable) > lengthControl.customMaxChar()) {
                throw new RuntimeException("Valore PathVariable max length: " + lengthControl.customMaxChar());
            }
        } else {
            if (getStringLength(pathVariable) > lengthControl.maxChar().getMaxChar()) {
                throw new RuntimeException("Valore PathVariable max length: " + lengthControl.maxChar().getMaxChar());
            }
        }
    }
}
