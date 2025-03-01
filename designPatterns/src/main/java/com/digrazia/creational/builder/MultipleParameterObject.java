package com.digrazia.creational.builder;

public class MultipleParameterObject {
    private String partA;
    private String partB;
    private String partC;

    public MultipleParameterObject(String partA, String partB, String partC) {
        this.partA = partA;
        this.partB = partB;
        this.partC = partC;
    }

    public MultipleParameterObject(String partA) {
        this.partA = partA;
        this.partB = null;
        this.partC = null;
    }

    public MultipleParameterObject(String partA, String partB) {
        this.partA = partA;
        this.partB = partB;
        this.partC = null;
    }
}
