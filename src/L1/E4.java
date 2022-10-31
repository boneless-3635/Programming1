package L1;

import java.util.Scanner;
import java.lang.Math;

public class E4 {
    public static void main(String[] args) {
        Scanner inputAScanner = new Scanner (System.in);
        Scanner inputBScanner = new Scanner (System.in);
        System.out.println("Enter A coordinates");
        String aCoordinates = inputAScanner.nextLine();
        System.out.println("Enter B coordinates");
        String bCoordinates = inputBScanner.nextLine();

        String[] partsA = aCoordinates.split(" ");
        Integer Ax = Integer.parseInt(partsA[0]);
        Integer Ay = Integer.parseInt(partsA[1]);

        String[] partsB = bCoordinates.split(" ");
        Integer Bx = Integer.parseInt(partsB[0]);
        Integer By = Integer.parseInt(partsB[1]);

        double lengthAB = Math.sqrt(Math.pow(Ax - Bx, 2) + Math.pow(Ay - By, 2));
        double circumference = lengthAB * 4;
        double area = Math.pow(lengthAB, 2);

        System.out.println(circumference);
        System.out.println(area);
    }
}
