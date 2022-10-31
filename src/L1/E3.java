package L1;

import java.util.Scanner;

public class E3 {
    public static void main(String[] args) {
        int hourCounter;
        int minuteCounter;
        int secondCounter;
        Scanner inputSeconds = new Scanner(System.in);
        System.out.println("Enter seconds: ");
        String seconds = inputSeconds.nextLine();

        hourCounter = Integer.parseInt(seconds) / 3600;
        minuteCounter = (Integer.parseInt(seconds) % 3600) / 60;
        secondCounter = ((Integer.parseInt(seconds) % 3600) % 60);
        System.out.println(hourCounter + ":" + minuteCounter + ":" + secondCounter);
    }
}
