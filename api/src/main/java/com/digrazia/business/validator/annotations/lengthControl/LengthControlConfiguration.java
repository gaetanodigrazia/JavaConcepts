package com.digrazia.business.validator.annotations.lengthControl;

public class LengthControlConfiguration {
    private static int maxLength;

    public LengthControlConfiguration(int maxLength) {
        this.maxLength = maxLength;
    }
    public static int getMaxLength() {
        return maxLength;
    }
}
