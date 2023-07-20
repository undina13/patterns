package org.example.factory;

public class CoffeeMachine {
    private final CoffeeFactory coffeeFactory;

    public CoffeeMachine(CoffeeFactory coffeeFactory) {
        this.coffeeFactory = coffeeFactory;
    }

    public Coffee makeCoffee(CoffeeType coffeeType) throws ClassNotFoundException {
        Coffee coffee = coffeeFactory.orderCoffee(coffeeType);
        coffee.makeCoffee();
        System.out.println("Вoт ваша чашка " + coffeeType);
        return coffee;
    }
}
