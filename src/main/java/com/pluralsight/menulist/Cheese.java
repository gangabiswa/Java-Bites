package com.pluralsight.menulist;

public class Cheese extends Premium{
    private String name;
    private double price;

    public Cheese(String name, double price, String name1, double price1) {
        super(name, price);
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
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }
}
