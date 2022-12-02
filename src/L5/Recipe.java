package L5;

import java.util.ArrayList;
import java.util.Scanner;

public class Recipe {
    private String name;
    private ArrayList<RecipeComponent> components;

    public Recipe(String name, RecipeComponent component) {
        this.name = name;
        this.components = new ArrayList<RecipeComponent>();
    }

    public void addComponent() {
        System.out.println("Component added");
        components.add(RecipeComponent.createRecipeComponent());
    }

    public void displayRecipe() {

    }
}
