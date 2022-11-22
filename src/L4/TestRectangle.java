package L4;

import java.util.Scanner;

public class TestRectangle {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("Enter width");
        int width = Integer.parseInt(inp.next());
        System.out.println("Enter height");
        int height = Integer.parseInt(inp.next());

        Rectangle rec = new Rectangle(width, height);
        rec.visualize(rec.getWidth(), rec.getHeight());
    }
}
