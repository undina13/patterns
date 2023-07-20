package org.example.proxy;

public class ConnectDbImpl implements ConnectDB {
    private final String dbName;

    public ConnectDbImpl(String dbName) {
        this.dbName = dbName;
    }
    @Override
    public void connect() {
        System.out.println("подключено " + dbName);
    }
}
