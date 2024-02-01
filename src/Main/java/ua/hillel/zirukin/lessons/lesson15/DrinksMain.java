package ua.hillel.zirukin.lessons.lesson15;

import java.util.Scanner;

import java.util.Scanner;

enum DrinksMachine {
    COFFEE, TEA, LEMONADE, MOJITO, MINERAL_WATER, COCA_COLA
}

class Drinks {
    public static final double COFFEE_PRICE = 2.5;
    public static final double TEA_PRICE = 1.8;
    public static final double LEMONADE_PRICE = 2.0;
    public static final double MOJITO_PRICE = 3.5;
    public static final double MINERAL_WATER_PRICE = 1.0;
    public static final double COCA_COLA_PRICE = 2.2;
}

class DrinksOrder {
    private int coffeeCount;
    private int teaCount;
    private int lemonadeCount;
    private int mojitoCount;
    private int mineralWaterCount;
    private int cocaColaCount;

    private static double totalCost = 0.0;

    public void makeCoffee() {
        coffeeCount++;
        totalCost += Drinks.COFFEE_PRICE;
        System.out.println("Making coffee...");
    }

    public void makeTea() {
        teaCount++;
        totalCost += Drinks.TEA_PRICE;
        System.out.println("Making tea...");
    }

    public void makeLemonade() {
        lemonadeCount++;
        totalCost += Drinks.LEMONADE_PRICE;
        System.out.println("Making lemonade...");
    }

    public void makeMojito() {
        mojitoCount++;
        totalCost += Drinks.MOJITO_PRICE;
        System.out.println("Making mojito...");
    }

    public void makeMineralWater() {
        mineralWaterCount++;
        totalCost += Drinks.MINERAL_WATER_PRICE;
        System.out.println("Pouring mineral water...");
    }

    public void makeCocaCola() {
        cocaColaCount++;
        totalCost += Drinks.COCA_COLA_PRICE;
        System.out.println("Pouring Coca-Cola...");
    }

    public void serveDrink(DrinksMachine choice) {
        switch (choice) {
            case COFFEE:
                makeCoffee();
                break;
            case TEA:
                makeTea();
                break;
            case LEMONADE:
                makeLemonade();
                break;
            case MOJITO:
                makeMojito();
                break;
            case MINERAL_WATER:
                makeMineralWater();
                break;
            case COCA_COLA:
                makeCocaCola();
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }

    public void placeOrder(DrinksMachine[] order) {
        for (DrinksMachine choice : order) {
            serveDrink(choice);
        }
    }

    public static void displayTotalCost() {
        System.out.println("Total cost: $" + totalCost);
    }
}

public class DrinksMain {
    public static void main(String[] args) {
        DrinksOrder order = new DrinksOrder();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Drinks Machine!");
        System.out.println("Choose your drinks:");

        for (DrinksMachine drink : DrinksMachine.values()) {
            System.out.println(drink.ordinal() + 1 + ". " + drink.name());
        }

        System.out.println("Enter the drink names (separated by spaces):");
        String input = scanner.nextLine();
        String[] choices = input.split(" ");

        DrinksMachine[] customerOrder = new DrinksMachine[choices.length];

        for (int i = 0; i < choices.length; i++) {
            try {
                customerOrder[i] = DrinksMachine.valueOf(choices[i].toUpperCase());
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid drink choice: " + choices[i]);
                System.exit(1);
            }
        }

        order.placeOrder(customerOrder);
        DrinksOrder.displayTotalCost();
        scanner.close();
    }
}
