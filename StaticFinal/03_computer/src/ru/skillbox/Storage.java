package ru.skillbox;

import ru.skillbox.enums.StorageType;

public class Storage {
    private final StorageType storageType;
    private final int memoryAmount;
    private final int weight;

    public Storage(StorageType storageType, int memoryAmount, int weight) {
        this.storageType = storageType;
        this.memoryAmount = memoryAmount;
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }
}
