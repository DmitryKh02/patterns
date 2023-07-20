package org.example.Singleton;

public class SecondClass {

    private final Logger logger = Logger.getInstance();

    public void doSomethingElse() {
        // Логирование информации о SecondClass
        logger.log("SecondClass", "Another message");
    }
}
