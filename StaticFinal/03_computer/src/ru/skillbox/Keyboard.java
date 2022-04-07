package ru.skillbox;

import ru.skillbox.enums.KeyboardType;

 class Keyboard {

    private final KeyboardType keyboardType;
    private final boolean backlight;
    private final int weight;

     Keyboard(KeyboardType keyboardType, boolean backlight, int weight) {
        this.keyboardType = keyboardType;
        this.backlight = backlight;
        this.weight = weight;
    }

     int getWeight() {
        return weight;
    }
}
