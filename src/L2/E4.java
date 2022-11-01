package L2;

import java.util.Scanner;
import java.lang.Math;

public class E4 {
    public static void main(String[] args) {
//        Input first circle's data
        Scanner circle1Scanner = new Scanner(System.in);
        System.out.print("Enter the first circle's x-coordinate, y-coordinate and radius: ");
        String circle1 = circle1Scanner.nextLine();

//        Input second circle's data
        Scanner circle2Scanner = new Scanner(System.in);
        System.out.print("Enter the second circle's x-coordinate, y-coordinate and radius: ");
        String circle2 = circle2Scanner.nextLine();

//        split the input of the first circle into 3 variables
        String[] circle1Content = circle1.split(" ");
        float circle1X = Float.parseFloat(circle1Content[0]);
        float circle1Y = Float.parseFloat(circle1Content[1]);
        float circle1R = Float.parseFloat(circle1Content[2]);

//        split the input of the second circle into 3 variables
        String[] circle2Content = circle2.split(" ");
        float circle2X = Float.parseFloat(circle2Content[0]);
        float circle2Y = Float.parseFloat(circle2Content[1]);
        float circle2R = Float.parseFloat(circle2Content[2]);

//        calculate the distance between the 2 circle centers
        double distanceAB = Math.sqrt(Math.pow(circle1X - circle2X, 2) + Math.pow(circle1Y - circle2Y, 2));

//        check all the situations
        if (distanceAB <= Math.abs(circle1R - circle2R)) {
            System.out.println("One circle is inside the other");
        } else if (distanceAB < circle1R + circle2R) {
            System.out.println("The two circles overlap");
        } else {
            System.out.println("The two circles do not overlap");
        }
    }
}
