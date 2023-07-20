package org.example.factory;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        CoffeeFactory coffeeFactory = new CoffeeFactory();
        CoffeeMachine coffeeMachine = new CoffeeMachine(coffeeFactory);
        Coffee coffee1 = coffeeMachine.makeCoffee(CoffeeType.LATTE);
        Coffee coffee2 = coffeeMachine.makeCoffee(CoffeeType.RAF);

    }
}