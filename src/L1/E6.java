package L1;

import java.util.Scanner;

public class E6 {
    public static void main(String[] args) {
        boolean positive = true;
        while (positive) {
            Scanner inputNumberScanner = new Scanner(System.in);
            System.out.print("Please enter a positive integer: ");
            int number = Integer.parseInt(inputNumberScanner.next());

            if (number < 0) {
                positive = false;
                System.out.println("Goodbye!");
            } else if ((number % 5 == 0 && number % 6 == 0)) {
                System.out.println(number + " is divisible by both 5 and 6");
            } else if (number % 5 == 0 || number % 6 == 0) {
                System.out.println(number + " is divisible by 5 or 6, but not both");
            } else {
                System.out.println(number + " is neither divisible by 5 nor 6");
            }
        }
    }
}
