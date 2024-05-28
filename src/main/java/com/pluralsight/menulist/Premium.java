package com.pluralsight.menulist;

import com.pluralsight.ITopping;

public abstract class Premium implements ITopping {

    String Name;
    double price;
    boolean isExtra;

    public Premium(String name, double price) {
        Name = name;
        this.price = price;
    }

    public Premium(String name, double price, boolean isExtra) {
        Name = name;
        this.price = price;
        this.isExtra = isExtra;
    }

    @Override
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public double getPrice(String size) {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
