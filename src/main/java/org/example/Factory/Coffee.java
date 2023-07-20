package org.example.Factory;

// Класс Coffee
class Coffee {
    private final String name;

    public Coffee(String name) {
        this.name = name;
    }

    public String getCoffee() {
        return name;
    }
}