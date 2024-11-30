package com.digrazia.business.validator.annotations.lengthControl;

public class LengthControlConfiguration {
    private static String message;

    public LengthControlConfiguration() {
    }

    public static String getMessage() {
        return message;
    }
    public static void setMessage(String message) {
        LengthControlConfiguration.message = message;
    }
}
