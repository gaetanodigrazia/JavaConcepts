package com.digrazia.creational.factory;

/**
 * Factory class for creating Battery objects.
 */
public class BatteryFactory {

    /**
     * Creates a Battery based on the given type.
     * @param type Type of Battery
     * @return Instance of Battery
     */
    public static Battery createProduct(BatteryType type) {
        switch (type) {
            case AA ->
            {
                return new AA();
            }
            case AAA ->
            {
                return new AAA();
            }
        }
        return null;
    }
}
