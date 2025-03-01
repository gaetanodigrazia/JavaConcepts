package com.digrazia.creational.abstractFactory;

public class DogFactory implements AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Dog();
    }
}
