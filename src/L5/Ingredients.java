package L5;

import java.util.Scanner;

public class Ingredients {
    private String name;
    private String measurement;

    public Ingredients(String name, String measurement) {
        this.name = name;
        setMeasurementUnit(measurement);
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

    public void setMeasurementUnit(String measurementUnit) {
        // We prevent the outsiders from modifying the unit of our ingredient with invalid units
        // This is how we encapsulate our data fields (make them private and provide getters/setters)
        String[] availableUnits = {"teaspoon", "spoon", "mg", "kg"};
        boolean matched = false;

        do{
            for (String unit: availableUnits){
                if (measurementUnit.equals(unit)) {
                    matched = true;
                    break;
                }
            }
            if (matched)
                this.measurement = measurementUnit;
            else{
                System.out.println("Error unit! Please re-enter again:");
                Scanner scanner = new Scanner(System.in);
                measurementUnit = scanner.nextLine();
            }
        } while (!matched);
    }


//        while (true) {
//            for (String unit: acceptableUnits) {
//                if (measurement.equals(unit)) {
//                    match = true;
//                    break;
//                }
//            }
//            if (!match) {
//                Scanner scan = new Scanner(System.in);
//                System.out.println("Enter your ingredient measurement unit");
//                this.measurement = scan.next();
//            } else {
//                break;
//            }
//        }


}
