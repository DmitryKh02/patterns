package org.example.AbstractFactory;

// Фабрика для создания Espresso
class EspressoFactory implements CoffeeFactory {
    @Override
    public Coffee createCoffee() {
        return new Espresso();
    }
}
