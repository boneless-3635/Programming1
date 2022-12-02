package L5;

import java.util.Scanner;

public class RecipeComponent {
    private Ingredient ingredient;
    private double amount;

    public RecipeComponent(Ingredient ingredient, double amount) {
        this.ingredient = ingredient;
        this.amount = amount;
    }

    public static RecipeComponent createRecipeComponent() {
        Ingredient ingredient1 = Ingredient.createIngredient();

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the amount");
        double amount = scan.nextDouble();

        return new RecipeComponent(ingredient1, amount);
    }

    public void displayComponent() {
        this.ingredient.displayIngredient();
        System.out.printf("The amount is %f.2", amount);
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
