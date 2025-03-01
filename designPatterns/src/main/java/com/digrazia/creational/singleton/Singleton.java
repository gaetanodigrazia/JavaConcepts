package com.digrazia.creational.singleton;

/**
 * Singleton class that ensures only one instance exists.
 */
public class Singleton {
    private static Singleton instance;
    private static int instantiationCounter = 0;

    private Singleton() {}

    /**
     * Provides global access to the single instance
     * @return Singleton instance
     */
    public static Singleton getInstance() {
        if (instance == null) {
            instantiationCounter += 1;
            instance = new Singleton();
        }
        return instance;
    }

    /**
     * Example method to demonstrate Singleton usage.
     */
    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }

    /**
     * Example method to demonstrate Singleton usage.
     */
    public void showCounter() {
        System.out.println("Counter: " + instantiationCounter);
    }
}
