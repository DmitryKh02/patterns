package org.example.AbstractFactory;

// Конкретный класс Espresso
class Espresso extends Coffee {
    @Override
    public String getCoffeeName() {
        return "Espresso";
    }
}