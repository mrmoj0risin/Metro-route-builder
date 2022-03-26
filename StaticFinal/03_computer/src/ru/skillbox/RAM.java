package ru.skillbox;

import ru.skillbox.enums.RamType;

public class RAM {

    private final RamType ramType;
    private final int ramAmount;
    private final int weight;

    public RAM(RamType ramType, int ramAmount, int weight) {
        this.ramType = ramType;
        this.ramAmount = ramAmount;
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }
}
