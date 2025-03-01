package com.digrazia.creational.factory;

public class AA implements Battery {

    public AA() {}

    @Override
    public void charge() {
        System.out.println("AA charged");
    }
}
