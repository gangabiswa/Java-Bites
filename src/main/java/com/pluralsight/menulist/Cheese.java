package com.pluralsight.menulist;

public class Cheese extends Premium {
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
        if (size.equalsIgnoreCase("small")) {
            this.price = 0.75;
        } else if (size.equalsIgnoreCase("medium")) {
            this.price = 1.50;
        } else if (size.equalsIgnoreCase("large")) {
            this.price = 2.25;
        }

        if (isExtra) {
            switch (size.toLowerCase()) {
                case "small":
                    price += 0.3;
                    break;
                case "medium":
                    price += 0.6;
                    break;
                case "large":
                    price += 0.9;
                    break;
            }
        }
        return price;
    }




    @Override
    public void setPrice(double price) {
        this.price = price;
    }
}
