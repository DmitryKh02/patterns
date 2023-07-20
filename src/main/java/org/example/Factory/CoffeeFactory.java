package org.example.Factory;


// Фабричный метод для создания различных видов кофе
class CoffeeFactory {
    public static Coffee createCoffee(String type) {
        return switch (type.toLowerCase()) {
            case "espresso" -> new Espresso();
            case "americano" -> new Americano();
            default -> throw new IllegalArgumentException("Unsupported coffee type: " + type);
        };
    }
}