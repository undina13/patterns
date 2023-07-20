package org.example.proxy;

public class ProxyConnectDb implements ConnectDB {
    private final ConnectDbImpl connectDb;
    private final String proxyPrefix = "localhost:port/";

    public ProxyConnectDb(String url) {
        this.connectDb = new ConnectDbImpl(proxyPrefix + url);
    }

    @Override
    public void connect() {
        connectDb.connect();
    }
}
