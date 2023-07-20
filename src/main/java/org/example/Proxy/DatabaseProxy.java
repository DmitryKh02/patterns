package org.example.Proxy;

// Прокси для базы данных
class DatabaseProxy implements Database {
    private RealDatabase realDatabase;
    private final String serverAddress;

    public DatabaseProxy(String serverAddress) {
        this.serverAddress = serverAddress;
    }

    @Override
    public void connect(String databaseName) {
        if (realDatabase == null) {
            realDatabase = new RealDatabase();
        }

        String fullDatabaseName = serverAddress + "/" + databaseName;
        realDatabase.connect(fullDatabaseName);
    }
}