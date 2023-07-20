package org.example.adapter;

public class Usb implements UsbReadable{
    @Override
    public void read() {
        System.out.println("Читаю информацию с usb");
    }
}
