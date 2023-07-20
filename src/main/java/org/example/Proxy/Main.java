package org.example.Proxy;

// Пример использования прокси для подключения к базе данных
public class Main {
    public static void main(String[] args) {
        String serverAddress = "localhost:3306";
        DatabaseProxy databaseProxy = new DatabaseProxy(serverAddress);

        // Подключение к базе данных через прокси
        databaseProxy.connect("my_database");
    }
}
