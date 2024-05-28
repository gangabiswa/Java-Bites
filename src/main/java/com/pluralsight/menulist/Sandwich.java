package com.pluralsight.menulist;

import com.pluralsight.ITopping;

import java.util.List;

public class Sandwich {
    private String size;
    private String BreadType;
    private boolean toasted;
    private List<ITopping> Topping;

    public Sandwich(String size, String breadType, boolean toasted, List<ITopping> topping) {
        this.size = size;
        BreadType = breadType;
        this.toasted = toasted;
        Topping = topping;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getBreadType() {
        return BreadType;
    }

    public void setBreadType(String breadType) {
        BreadType = breadType;
    }

    public boolean isToasted() {
        return toasted;
    }

    public void setToasted(boolean toasted) {
        this.toasted = toasted;
    }

    public List<ITopping> getTopping() {
        return Topping;
    }

    public void setTopping(List<ITopping> topping) {
        Topping = topping;
    }

    public void getPrice() {
        double total = 0;
        if (size.equalsIgnoreCase("small")) {
            total += 5.5;
        } else if (size.equalsIgnoreCase("medium")) {
            total+=7.0;
        }else if
        (size.equalsIgnoreCase("large")) {
                total+=8.5;
            }
        for (ITopping iTopping : Topping) {
            total+=iTopping.getPrice(size);
        }
    }

}
