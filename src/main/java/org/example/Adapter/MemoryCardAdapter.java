package org.example.Adapter;


// Адаптер для чтения информации с карты памяти через USB
class MemoryCardAdapter implements USBReader {
    private final MemoryCard memoryCard;

    public MemoryCardAdapter(MemoryCard memoryCard) {
        this.memoryCard = memoryCard;
    }

    @Override
    public void readFromUSB() {
        memoryCard.readFromMemoryCard();
    }
}