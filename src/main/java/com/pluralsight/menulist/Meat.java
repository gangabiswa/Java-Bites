package com.pluralsight.menulist;

public class Meat extends Premium{
    private String name;
    private double price;

    public Meat(String name, double price, String name1, double price1) {
        super(name, price);
        this.name = name1;
        this.price = price1;
    }

    public Meat(String name, double price, boolean isExtra, String name1, double price1) {
        super(name, price, isExtra);
        this.name = name1;
        this.price = price1;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double getPrice(String size) {
        if (size.equalsIgnoreCase("small")) {
            this.price = 1.00;


        } else if (size.equalsIgnoreCase("medium")) {
            this.price = 2.00;
        } else if (size.equalsIgnoreCase("large")) {
            this.price = 3.00;
        }

        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }
}
