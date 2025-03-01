package com.digrazia.creational.factory;

public class AAA implements Battery {

    public AAA(){}

    @Override
    public void charge() {
        System.out.println("AAA charged");
    }
}
