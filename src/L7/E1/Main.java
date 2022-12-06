package L7.E1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        double cirRad = scan.nextDouble();

        Circle circle = new Circle(cirRad);
        System.out.printf("The area of the circle is: %.2f\n", circle.getArea());
        System.out.printf("The circle information: %s\n", circle.toString());

        System.out.println("Enter the height of the cylinder: ");
        double cylHeight = scan.nextDouble();

        Cylinder cylinder = new Cylinder(cylHeight, circle.getRadius());
        System.out.printf("The surface area of the cylinder is: %.2f\n", cylinder.getArea());
        System.out.printf("The cylinder information: %s", cylinder.toString());
    }
}
