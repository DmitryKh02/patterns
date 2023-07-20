package org.example.AbstractFactory;

// Фабрика для создания Americano
class AmericanoFactory implements CoffeeFactory {
    @Override
    public Coffee createCoffee() {
        return new Americano();
    }
}