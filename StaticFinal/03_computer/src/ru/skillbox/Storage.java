package ru.skillbox;

import ru.skillbox.enums.StorageType;

 class Storage {
    private final StorageType storageType;
    private final int memoryAmount;
    private final int weight;

     Storage(StorageType storageType, int memoryAmount, int weight) {
        this.storageType = storageType;
        this.memoryAmount = memoryAmount;
        this.weight = weight;
    }

     int getWeight() {
        return weight;
    }
}
