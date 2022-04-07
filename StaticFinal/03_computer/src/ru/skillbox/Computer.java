package ru.skillbox;

 class Computer {
    private Processor processor;
    private RAM ram;
    private Storage storage;
    private Screen screen;
    private Keyboard keyboard;
    private final String vendor;
    private final String name;

     Computer(Processor processor, RAM ram, Storage storage, Screen screen,
                    Keyboard keyboard, String vendor, String name) {
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
        this.screen = screen;
        this.keyboard = keyboard;
        this.vendor = vendor;
        this.name = name;
    }

     int getTotalWeight(){
        int totalWeight = this.keyboard.getWeight() +
                this.processor.getWeight() +
                this.ram.getWeight() +
                this.storage.getWeight();
        return totalWeight;
    }

     Processor getProcessor() {
        return processor;
    }

     void setProcessor(Processor processor) {
        this.processor = processor;
    }

     RAM getRam() {
        return ram;
    }

     void setRam(RAM ram) {
        this.ram = ram;
    }

     Storage getStorage() {
        return storage;
    }

     void setStorage(Storage storage) {
        this.storage = storage;
    }

     Screen getScreen() {
        return screen;
    }

     void setScreen(Screen screen) {
        this.screen = screen;
    }

     Keyboard getKeyboard() {
        return keyboard;
    }

     void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

     String getVendor() {
        return vendor;
    }

     String getName() {
        return name;
    }
}
