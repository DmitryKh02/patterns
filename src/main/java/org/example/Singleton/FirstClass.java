package org.example.Singleton;

public class FirstClass {

    private final Logger logger = Logger.getInstance();

    public void doSomething() {
        // Логирование информации о FirstClass
        logger.log("FirstClass", "Some message");
    }
}
