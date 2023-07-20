package org.example.Adapter;

// Пример использования адаптера для чтения данных с карты памяти через USB
public class Main {
    public static void main(String[] args) {
        MemoryCard memoryCard = new MemoryCard();
        MemoryCardAdapter memoryCardAdapter = new MemoryCardAdapter(memoryCard);
        Computer computer = new Computer();
        computer.readDataFromUSB(memoryCardAdapter);
    }
}