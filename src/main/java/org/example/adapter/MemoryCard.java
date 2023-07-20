package org.example.adapter;

public class MemoryCard implements MemoryCardReadable{
    @Override
    public void read() {
        System.out.println("Читаю информацию с карты памяти");
    }
}
