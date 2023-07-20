package org.example.Adapter;

// Класс компьютера
class Computer {
    void readDataFromUSB(USBReader usbReader) {
        System.out.println("Connecting USB adapter to the computer...");
        usbReader.readFromUSB();
    }
}