package org.example.AbstractFactory;

public class Main {
    public static void main(String[] args) {
        CoffeeFactory espressoFactory = new EspressoFactory();
        CoffeeFactory americanoFactory = new AmericanoFactory();

        Coffee espresso = espressoFactory.createCoffee();
        Coffee americano = americanoFactory.createCoffee();

        System.out.println("I ordered: " + espresso.getCoffeeName());
        System.out.println("I ordered: " + americano.getCoffeeName());
    }
}