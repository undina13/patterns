package org.example.proxy;

public class Main {
    public static void main(String[] args) {
        ConnectDB connectDB = new ConnectDbImpl("users");
        connectDB.connect();

        ConnectDB connectDBProxy = new ProxyConnectDb("users");
        connectDBProxy.connect();
    }
}