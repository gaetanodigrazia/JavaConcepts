package com.digrazia.creational.abstractFactory;

public class ChimpanzeeFactory implements AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Chimpanzee();
    }
}
