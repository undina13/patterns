package org.example.factory;

public class CoffeeFactory {
    public Coffee  orderCoffee (CoffeeType coffeeType) throws ClassNotFoundException {
        return switch (coffeeType) {
            case LATTE -> new Latte();
            case RAF -> new Raf();
            default -> throw new ClassNotFoundException("Такого кофе нет в меню");
        };
    }
}
