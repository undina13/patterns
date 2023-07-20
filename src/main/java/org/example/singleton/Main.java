package org.example.singleton;

import org.example.factory.Coffee;

public class Main {
    public static void main(String[] args) {
Logger.getInstance().writeInfo("Some info", Coffee.class);
    }
}