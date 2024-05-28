package com.pluralsight.menulist;

public class Chips {
    private String name;
    private double price = 1.5;

    public Chips(String name ){
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

    public void display(){
        System.out.println(getName()+"chips");
    }
}
