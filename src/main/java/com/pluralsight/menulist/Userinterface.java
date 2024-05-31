
package com.pluralsight.menulist;

import com.pluralsight.ITopping;

import javax.lang.model.element.Name;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Userinterface {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1) Home");
            System.out.println("0) Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    createOrder(scanner);
                    break;
                case 0:
                    System.out.println("Exiting.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);
        scanner.close();
    }
    private static void createOrder(Scanner scanner) {
        Customer customer = new Customer("", "");
        List<Sandwich> sandwiches = new ArrayList<>();
        List<Drink> drinks = new ArrayList<>();
        List<Chips> chips = new ArrayList<>();

        boolean addingItems = true;
        while (addingItems) {
            System.out.println("What would you like to add?");
            System.out.println("1) Sandwich");
            System.out.println("2) Drink");
            System.out.println("3) Chips");
            System.out.println("0) Finalize Order");
            System.out.print("Enter your choice: ");
            int itemType = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (itemType) {
                case 1:
                    Sandwich sandwich = createSandwich(scanner);
                    sandwiches.add(sandwich);
                    break;
                case 2:
                    Drink drink = createDrink(scanner);
                    drinks.add(drink);
                    break;
                case 3:
                    Chips chip = createChips(scanner);
                    chips.add(chip);
                    break;
                case 0:
                    addingItems = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        Order order = new Order(customer, sandwiches, drinks, chips);
        System.out.println("Order details:");
        System.out.println(order);

        writeReceiptToFile(order);
    }

    private static Chips createChips(Scanner scanner) {
        return null;
    }

    private static Drink createDrink(Scanner scanner) {
        System.out.println("select drink type");
        System.out.println("1) cocacola");
        System.out.println("2) pepsi");
        System.out.println("3) mango drink");
        System.out.println(" enter your choice");
        String Drinktype = "";

        switch (scanner.nextInt()) {
            case 1:
                Drinktype = "cocacola";
                break;
            case 2:
                Drinktype = "pepsi";
            case 3:
                Drinktype = "mango drink";
                break;
            default:
                System.out.println("invalid choice defaulting to cocacola");
                Drinktype = "cocacola";
        }
        scanner.nextLine();

        System.out.println("Select drink size: ");
        System.out.println("1) Small");
        System.out.println("2) Medium");
        System.out.println("3) Large");
        System.out.print("Enter your choice: ");
        double size;
        switch (scanner.nextInt()) {
            case 1:
                size = 4.0;
                break;
            case 2:
                size = 8.0;
                break;
            case 3:
                size = 12.0;
                break;
            default:
                System.out.println("Invalid choice. Defaulting to Medium.");
                size = 8.0;
        }
        Drink drink = new Drink(Drinktype, size);
        return drink;
    }

    private static Sandwich createSandwich(Scanner scanner) {

        System.out.println("Select bread type: ");
        System.out.println("1) White");
        System.out.println("2) Wheat");
        System.out.println("3) Rye");
        System.out.println("4) Wrap");
        System.out.print("Enter your choice: ");
        String breadType = "";
        switch (scanner.nextInt()) {
            case 1:
                breadType = "White";
                break;
            case 2:
                breadType = "Wheat";
                break;
            case 3:
                breadType = "Rye";
                break;
            case 4:
                breadType = "Wrap";
                break;
            default:
                System.out.println("Invalid choice. Defaulting to White.");
                breadType = "White";
        }
        scanner.nextLine();

        System.out.println("Select sandwich size: ");
        System.out.println("1) Small");
        System.out.println("2) Medium");
        System.out.println("3) Large");
        System.out.print("Enter your choice: ");
        String size = "";
        switch (scanner.nextInt()) {
            case 1:
                size = "Small";
                break;
            case 2:
                size = "Medium";
                break;
            case 3:
                size = "Large";
                break;
            default:
                System.out.println("Invalid choice. Defaulting to Medium.");
                size = "Medium";
        }
        scanner.nextLine();


        System.out.println("Do you want your sandwich toasted? (yes/no): ");
        boolean toasted = scanner.nextLine().equalsIgnoreCase("yes");


        List<ITopping> toppings = new ArrayList<>();
        boolean addMoreToppings;
        do {
            System.out.println("Select topping type: ");
            System.out.println("1) Regular Topping");
            System.out.println("2) Premium Topping (Meat)");
            System.out.println("3) Premium Topping (Cheese)");
            System.out.print("Enter your choice: ");
            int toppingType = scanner.nextInt();
            scanner.nextLine();

            ITopping topping = null;
            switch (toppingType) {
                case 1:
                    System.out.println("Select Regular Topping: ");
                    System.out.println("1) Lettuce");
                    System.out.println("2) Peppers");
                    System.out.println("3) Onions");
                    System.out.println("4) Tomatoes");
                    System.out.println("5) Jalapenos");
                    System.out.println("6) Cucumbers");
                    System.out.println("7) Pickles");
                    System.out.println("8) Guacamole");
                    System.out.println("9) Mushrooms");
                    System.out.print("Enter your choice: ");
                    int regularChoice = scanner.nextInt();
                    scanner.nextLine();

                    String[] regularToppings = {"Lettuce", "Peppers", "Onions", "Tomatoes", "Jalapenos", "Cucumbers", "Pickles", "Guacamole", "Mushrooms"};
                    if (regularChoice >= 1 && regularChoice <= 9) {
                        topping = new Regular(regularToppings[regularChoice - 1]);
                    } else {
                        System.out.println("Invalid choice. Skipping topping.");
                    }
                    break;

                case 2:
                    System.out.println("Select Meat Topping: ");
                    System.out.println("1) Steak");
                    System.out.println("2) Ham");
                    System.out.println("3) Salami");
                    System.out.println("4) Roasted Beef");
                    System.out.println("5) Chicken");
                    System.out.println("6) Bacon");
                    System.out.print("Enter your choice: ");
                    int meatChoice = scanner.nextInt();
                    scanner.nextLine();

                    String[] meatToppings = {"Steak", "Ham", "Salami", "Roasted Beef", "Chicken", "Bacon"};
                    if (meatChoice >= 1 && meatChoice <= 6) {
                        System.out.print("Is this an extra meat topping? (yes/no): ");
                        boolean isExtraMeat = scanner.nextLine().equalsIgnoreCase("yes");
                        topping = new Meat(meatToppings[meatChoice - 1], 1.50, isExtraMeat);
                    } else {
                        System.out.println("Invalid choice. Skipping topping.");
                    }
                    break;

                case 3:
                    System.out.println("Select Cheese Topping: ");
                    System.out.println("1) American");
                    System.out.println("2) Provolone");
                    System.out.println("3) Cheddar");
                    System.out.println("4) Swiss");
                    System.out.print("Enter your choice: ");
                    int cheeseChoice = scanner.nextInt();
                    scanner.nextLine();

                    String[] cheeseToppings = {"American", "Provolone", "Cheddar", "Swiss"};
                    if (cheeseChoice >= 1 && cheeseChoice <= 4) {
                        System.out.print("Is this an extra cheese topping? (yes/no): ");
                        boolean isExtraCheese = scanner.nextLine().equalsIgnoreCase("yes");
                        topping = new Cheese(cheeseToppings[cheeseChoice - 1], 0.75, isExtraCheese);
                    } else {
                        System.out.println("Invalid choice. Skipping topping.");
                    }
                    break;

                default:
                    System.out.println("Invalid topping type.");
            }

            if (topping != null) {
                toppings.add(topping);
            }

            System.out.print("Do you want to add more toppings? (yes/no): ");
            addMoreToppings = scanner.nextLine().equalsIgnoreCase("yes");
        } while (addMoreToppings);


        boolean addMoreSauces;
        do {
            System.out.println("Select Sauce: ");
            System.out.println("1) Mayo");
            System.out.println("2) Mustard");
            System.out.println("3) Ranch");
            System.out.println("4) Ketchup");
            System.out.println("5) Thousand Islands");
            System.out.println("6) Vinaigrette");
            System.out.print("Enter your choice: ");
            int sauceChoice = scanner.nextInt();
            scanner.nextLine();

            String[] sauces = {"Mayo", "Mustard", "Ranch", "Ketchup", "Thousand Islands", "Vinaigrette"};
            if (sauceChoice >= 1 && sauceChoice <= 6) {
                toppings.add(new Regular(sauces[sauceChoice - 1]));
            } else {
                System.out.println("Invalid choice. Skipping sauce.");
            }

            System.out.print("Do you want to add more sauces? (yes/no): ");
            addMoreSauces = scanner.nextLine().equalsIgnoreCase("yes");
        } while (addMoreSauces);


        Sandwich sandwich = new Sandwich(size, breadType, toasted, toppings);


        System.out.println("Your sandwich details:");
        System.out.println(sandwich);

        return sandwich;
    }

    private static void writeReceiptToFile(Order order) {
        try (FileWriter writer = new FileWriter("receipt.txt")) {
            writer.write("Receipt\n");
            writer.write("Customer: " + order.getCustomer().getName() + "\n");
            writer.write("Sandwiches:\n");

            for (Sandwich sandwich : order.getSandwich()) {
                writer.write(sandwich.toString() + "\n");
            }

            writer.write("Drinks:\n");
            for (Drink drink : order.getDrinks()) writer.write(drink.getName() + " - $" + drink.getPrice() );
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}