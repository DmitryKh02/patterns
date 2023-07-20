package org.example.Singleton;

public class Logger {

    // Создаем статическую переменную для хранения единственного экземпляра логгера
    private static Logger instance;

    // Приватный конструктор, чтобы предотвратить создание новых экземпляров извне
    private Logger() {}

    // Метод для получения единственного экземпляра логгера
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // Метод для вывода лога
    public void log(String className, String message) {
        System.out.println("Log info: " + className + ", " + message);
    }
}
