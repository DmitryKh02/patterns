package org.example.Factory;

// Пример использования фабричного метода для создания кофе
public class Main {
    public static void main(String[] args) {
        Coffee espresso = CoffeeFactory.createCoffee("espresso");
        Coffee americano = CoffeeFactory.createCoffee("americano");

        System.out.println("I ordered: " + espresso.getCoffee());
        System.out.println("I ordered: " + americano.getCoffee());
    }
}