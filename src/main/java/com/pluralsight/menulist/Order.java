package com.pluralsight.menulist;

import java.util.List;

public class Order {
    private List<Sandwich> sandwich;
    private List<Drink> drinks;
    private List<Chips> chips;

    public Order( List<Sandwich> sandwich, List<Drink> drinks, List<Chips> chips) {

        this.sandwich = sandwich;
        this.drinks = drinks;
        this.chips = chips;
    }



    public List<Sandwich> getSandwich() {
        return sandwich;
    }

    public List<Drink> getDrinks() {
        return drinks;
    }

    public List<Chips> getChips() {
        return chips;
    }

    @Override
    public String toString() {
        return "Order{" +
                ", sandwich=" + sandwich .toString()+
                ", drinks=" + drinks.toString() +
                ", chips=" + chips.toString() +
                '}';
    }
}
