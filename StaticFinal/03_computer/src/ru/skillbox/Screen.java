package ru.skillbox;

import ru.skillbox.enums.ScreenResolution;
import ru.skillbox.enums.ScreenType;

 class Screen {
    private final ScreenResolution screenResolution;
    private final ScreenType screenType;
    private final int weight;

    public Screen(ScreenResolution screenResolution, ScreenType screenType, int weight) {
        this.screenResolution = screenResolution;
        this.screenType = screenType;
        this.weight = weight;
    }

     int getWeight() {
        return weight;
    }
}
