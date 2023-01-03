package L10.E2;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println(getIntFromUser());
    }

    public static int getIntFromUser() {
        try {
//            Take the user input
            Scanner userInput = new Scanner(System.in);
            System.out.println("Please enter an integer");
//            Return the input as an integer
            return Integer.parseInt(userInput.next());
        } catch (Exception e) {
//            If input is not integer -> exception
            System.out.println("The value entered is not an integer");
            return 0;
        }
    }
}
