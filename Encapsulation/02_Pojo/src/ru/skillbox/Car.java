package ru.skillbox;

 class Car {

    private int productionYear;
    private String color;
    private String engine;
    private int weight;

    public Car(int productionYear, String color) {
        this.productionYear = productionYear;
        this.color = color;
    }

     int getProductionYear() {
        return productionYear;
    }

     void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

     String getColor() {
        return color;
    }

     void setColor(String color) {
        this.color = color;
    }

     String getEngine() {
        return engine;
    }

     void setEngine(String engine) {
        this.engine = engine;
    }

     int getWeight() {
        return weight;
    }

     void setWeight(int weight) {
        this.weight = weight;
    }
}
