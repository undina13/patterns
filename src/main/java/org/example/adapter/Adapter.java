package org.example.adapter;

public class Adapter implements UsbReadable {
    private final MemoryCard memoryCard;

    public Adapter(MemoryCard memoryCard) {
        this.memoryCard = memoryCard;
    }

    @Override
    public void read() {
        memoryCard.read();
    }
}
