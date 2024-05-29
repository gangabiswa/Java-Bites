package com.pluralsight.menulist;

import java.util.List;

public class Order {
    private Customer customer;
    private List<Sandwich> sandwich;
    private List<Drink> drinks;
    private List<Chips> chips;

    public Order(Customer customer, List<Sandwich> sandwich, List<Drink> drinks, List<Chips> chips) {
        this.customer = customer;
        this.sandwich = sandwich;
        this.drinks = drinks;
        this.chips = chips;
    }

    public Customer getCustomer() {
        return customer;
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
}
