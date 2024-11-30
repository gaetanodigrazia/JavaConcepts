package com.digrazia.business.validator.annotations.lengthControl;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.logging.LogLevel;
import org.springframework.boot.logging.LoggingSystem;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class PathVariableAspect {
    Logger log = LoggerFactory.getLogger(PathVariableAspect.class);

    @Before("@annotation(lengthControl)")
    public void logPathVariable(JoinPoint joinPoint, LengthControl lengthControl) {
        Object[] args = joinPoint.getArgs();

        for (Object arg : args) {
            if (arg instanceof String) {
                checkMaxLength(arg.toString(), lengthControl.maxChar());

                if(log.isDebugEnabled()){
                    log.debug("DEBUG. " + arg.toString());
                }
                if("INFO".equals(lengthControl.logLevel())){
                    log.info("INFO: Valore PathVariable intercettato: " + arg);
                }
                if("ERROR".equals(lengthControl.logLevel())){
                    log.error("ERROR: Valore PathVariable intercettato: " + arg);
                }
            } else {
                throw new RuntimeException("Valore PathVariable intercettato: " + arg.getClass());
            }
        }
    }


    private int getStringLength(String pathVariable) {
       return pathVariable.length();
    }

    private void checkMaxLength(String pathVariable, LengthControl.UserValidation[] maxLength){
        for (LengthControl.UserValidation lengthControl : LengthControl.UserValidation.values()) {
            //System.out.println("Primo valore controllato: " + lengthControl.getMaxChar());
            if (getStringLength(pathVariable) > lengthControl.getMaxChar()) {
                throw new RuntimeException("Valore PathVariable max length: " + maxLength);
            }
        }
    }
    public String changeLogLevelToError(String logLevel) {
        LoggingSystem system = LoggingSystem.get(PathVariableAspect.class.getClassLoader());
        system.setLogLevel(PathVariableAspect.class.getName(), LogLevel.valueOf(logLevel));

        return "changed log level to error";
    }
}
