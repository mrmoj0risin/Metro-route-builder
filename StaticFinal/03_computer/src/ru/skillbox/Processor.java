package ru.skillbox;

public class Processor {

    private final int frequency;
    private final int coreCount;
    private final String vendor;
    private final int weight;

    public Processor(int frequency, int coreCount, String vendor, int weight) {
        this.frequency = frequency;
        this.coreCount = coreCount;
        this.vendor = vendor;
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }
}
