package org.example.Proxy;

// Реализация базы данных
class RealDatabase implements Database {
    @Override
    public void connect(String databaseName) {
        System.out.println("Connected to database: " + databaseName);
    }
}