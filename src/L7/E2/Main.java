package L7.E2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the color: ");
        String color = scan.next();

        System.out.println("Enter the length and width of the rectangle");
        int length = scan.nextInt();
        int width = scan.nextInt();

        Rectangle rectangle = new Rectangle(color, length, width);
        System.out.printf("The area of the rectangle: %.2f\n", rectangle.getArea());
        System.out.printf("The rectangle info: %s\n", rectangle);

        System.out.println("Enter the base and height of the triangle");
        int base = scan.nextInt();
        int height = scan.nextInt();

        Triangle triangle = new Triangle(color, base, height);
        System.out.printf("The area of the triangle: %.2f\n", triangle.getArea());
        System.out.printf("The triangle info: %s\n", triangle);
    }
}
