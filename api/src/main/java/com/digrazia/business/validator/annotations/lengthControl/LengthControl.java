package com.digrazia.business.validator.annotations.lengthControl;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface LengthControl {
    UserValidation[] maxChar() default UserValidation.UUID;
    String logLevel() default "OFF";

    enum UserValidation {

        UUID(36),
        RANDOM(4);

        private final int maxChar;

        UserValidation(int maxChar) {
            this.maxChar = maxChar;
        }

        int getMaxChar() {
            return this.maxChar;
        }
    }
}