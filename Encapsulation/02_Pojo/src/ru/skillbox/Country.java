package ru.skillbox;

 class Country {


    private String name;
    private int population;
    private int square;
    private String capital;
    private boolean isNearSea;


     Country(String name) {
        this.name = name;
    }

     String getName() {
        return name;
    }

     void setName(String name) {
        this.name = name;
    }

     int getPopulation() {
        return population;
    }

     void setPopulation(int population) {
        this.population = population;
    }

     int getSquare() {
        return square;
    }

     void setSquare(int square) {
        this.square = square;
    }

     String getCapital() {
        return capital;
    }

     void setCapital(String capital) {
        this.capital = capital;
    }

     boolean isNearSea() {
        return isNearSea;
    }

     void setNearSea(boolean nearSea) {
        isNearSea = nearSea;
    }
}
