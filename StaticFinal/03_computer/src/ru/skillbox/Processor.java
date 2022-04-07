package ru.skillbox;

 class Processor {

    private final int frequency;
    private final int coreCount;
    private final String vendor;
    private final int weight;

     Processor(int frequency, int coreCount, String vendor, int weight) {
        this.frequency = frequency;
        this.coreCount = coreCount;
        this.vendor = vendor;
        this.weight = weight;
    }

     int getWeight() {
        return weight;
    }
}
