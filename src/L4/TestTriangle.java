package L4;

import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("Input the 3 triangle sides");

        Triangle tri = new Triangle();
        tri.setS1(inp.nextInt());
        tri.setS2(inp.nextInt());
        tri.setS3(inp.nextInt());

        System.out.println(tri.verify());
    }
}
