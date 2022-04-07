package ru.skillbox;

import ru.skillbox.enums.RamType;

 class RAM {

    private final RamType ramType;
    private final int ramAmount;
    private final int weight;

     RAM(RamType ramType, int ramAmount, int weight) {
        this.ramType = ramType;
        this.ramAmount = ramAmount;
        this.weight = weight;
    }

     int getWeight() {
        return weight;
    }
}
