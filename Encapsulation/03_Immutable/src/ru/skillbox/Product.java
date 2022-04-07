package ru.skillbox;

 class Product {
    private final String name;
    private int price;
    private final String barCode;

     Product(String name, String barCode) {
        this.name = name;

        this.barCode = barCode;
    }

     String getName() {
        return name;
    }

     int getPrice() {
        return price;
    }

}