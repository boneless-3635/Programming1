package L2;

import java.util.Scanner;

public class E2 {
    public static void main(String[] args) {
        Scanner inputSidesScanner = new Scanner(System.in);
        System.out.print("Enter the number of sides: ");
        int sidesNumber = Integer.parseInt(inputSidesScanner.next());

        for (int i = 0; i < sidesNumber; i++) {
            for (int j = 0; j < sidesNumber; j++) {
                if (i == 0 || i == sidesNumber - 1 || j == 0 || j == sidesNumber - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}
