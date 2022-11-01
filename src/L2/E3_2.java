package L2;

import java.util.Scanner;

public class E3_2 {
    public static void main(String[] args) {
//        3 sides input
        Scanner inputSidesScanner = new Scanner(System.in);
        System.out.print("Enter the 3 triangle sides: ");
        String triangleSides = inputSidesScanner.nextLine();

//        split 3 sides into 3 variables
        String[] triangleIndividualSides = triangleSides.split(" ");
        int side1 = Integer.parseInt(triangleIndividualSides[0]);
        int side2 = Integer.parseInt(triangleIndividualSides[1]);
        int side3 = Integer.parseInt(triangleIndividualSides[2]);

//        use method to check triangle type
        System.out.println(E3.verify(side1, side2, side3));
    }
}
