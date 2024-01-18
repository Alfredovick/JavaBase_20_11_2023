package ua.hillel.zirukin.lessons.lesson11;

public class burger {
    private String bun;
    private String meat;
    private String cheese;
    private String veggies;
    private String mayo;

    public burger() {
        this.bun = "Regular Bun";
        this.meat = "Beef Patty";
        this.cheese = "Cheddar Cheese";
        this.veggies = "Lettuce, Tomato, Onion";
        this.mayo = "Mayonnaise";
        displayIngredients();
    }

    public burger(boolean isDiet) {
        this.bun = "Whole Wheat Bun";
        this.meat = "Chicken Patty";
        this.cheese = "Swiss Cheese";
        this.veggies = "Lettuce, Tomato, Onion";
        this.mayo = isDiet ? "No Mayonnaise" : "Mayonnaise";
        displayIngredients();
    }

    public burger(int doubleMeat) {
        this.bun = "Regular Bun";
        this.meat = "Double Beef Patty";
        this.cheese = "American Cheese";
        this.veggies = "Lettuce, Tomato, Pickles, Onion";
        this.mayo = "Mayonnaise";
        displayIngredients();
    }

    private void displayIngredients() {
        System.out.println("Burger Ingredients:");
        System.out.println("Bun: " + bun);
        System.out.println("Meat: " + meat);
        System.out.println("Cheese: " + cheese);
        System.out.println("Veggies: " + veggies);
        System.out.println("Mayo: " + mayo);
        System.out.println();
    }
}

