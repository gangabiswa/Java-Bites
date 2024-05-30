package com.pluralsight.menulist;

public class Meat extends Premium{
    private String name;
    private double price;
    private boolean isExtra;

    public Meat(String name, double price) {
        super(name, price);
        this.name = name;
        this.price = price;
    }

    public Meat(String name, double price, boolean isExtra) {
        super(name, price, isExtra);
        this.name = name;
        this.price = price;
        this.isExtra = isExtra;
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

        if(isExtra){
            switch (size.toLowerCase()){
                case "small":
                    price += 0.5;
                    break;
                case "medium":
                    price += 1.0;
                    break;
                case "large":
                    price += 1.5;
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
