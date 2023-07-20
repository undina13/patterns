package org.example.adapter;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.connect(new Adapter(new MemoryCard()));

    }
}