package ru.skillbox;

import ru.skillbox.enums.KeyboardType;

public class Keyboard {

    private final KeyboardType keyboardType;
    private final boolean backlight;
    private final int weight;

    public Keyboard(KeyboardType keyboardType, boolean backlight, int weight) {
        this.keyboardType = keyboardType;
        this.backlight = backlight;
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }
}
