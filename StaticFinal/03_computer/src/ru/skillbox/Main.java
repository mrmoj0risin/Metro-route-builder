package ru.skillbox;

import ru.skillbox.enums.*;

 class Main {

    public static void main(String[] args) {

        Keyboard keyboard = new Keyboard(KeyboardType.MECHANICAL, false, 240);
        Processor processor = new Processor(3300,8, "Intel", 95);
        RAM ram = new RAM(RamType.DDR4, 16, 24);
        Screen screen = new Screen(ScreenResolution.FOUR_K, ScreenType.IPS , 600);
        Storage storage = new Storage(StorageType.SSD, 512, 100);

        Computer myComp = new Computer(processor, ram,storage, screen, keyboard, "DELL", "Dell PC");

        System.out.println( myComp.getTotalWeight());

    }
}
