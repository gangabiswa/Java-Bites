package com.pluralsight.menulist;

public class Drink {
    private String name;
    private double price;

    public Drink(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice(String size) {
        if (size.equalsIgnoreCase("small")) {
            this.price = 1.00;
        } else if (size.equalsIgnoreCase("medium")) {
            this.price = 2.50;
        } else if (size.equalsIgnoreCase("large")) {
            this.price = 3.00;
        }
        return price;
    }
}
