package L5;

import java.util.Scanner;

public class Ingredients {
    private String name;
    private String measurement;

    public Ingredients(String name, String measurement) {
        this.name = name;
        setMeasurement(measurement);
    }

    public static Ingredients createIngredients() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your ingredient name");
        String name = scan.nextLine();

        System.out.println("Enter your ingredient measurement unit");
        String measurement = scan.nextLine();

        return new Ingredients(name, measurement);
    }

    public void displayIngredients() {
        System.out.printf("The ingredient is %s and the measurement unit is %s",
                this.getName(),
                this.getMeasurement());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMeasurement() {
        return measurement;
    }

    public void setMeasurement(String measurement) {
        String[] acceptableUnits = {"teaspoon", "spoon", "mg", "g"};
        boolean match = false;
        while (true) {
            for (String unit: acceptableUnits) {
                if (measurement.equals(unit)) {
                    match = true;
                    break;
                }
            }
            if (match) {
                Scanner scan = new Scanner(System.in);
                System.out.println("Enter your ingredient measurement unit");
                measurement = scan.nextLine();
            } else {
                break;
            }
        }
    }

}
