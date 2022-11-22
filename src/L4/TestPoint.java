package L4;

import java.util.Scanner;

public class TestPoint {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        Point a = new Point();
        Point b = new Point();

        System.out.println("Enter the first point x and y");
        a.setX(inp.nextInt());
        a.setY(inp.nextInt());

        System.out.println("Enter the second point x and y");
        b.setX(inp.nextInt());
        b.setY(inp.nextInt());

        System.out.println(a.distance(b));
    }
}
