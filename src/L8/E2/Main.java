package L8.E2;

import java.io.File;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner fileScanner = new Scanner(new File("src/L8/E1/users.txt"));
//        open file to read
        int totalAge = 0;
        int counter = 0;
//        needed to calculate average age


        while (fileScanner.hasNext()) {
            String line = fileScanner.nextLine();
            StringTokenizer reader = new StringTokenizer(line, ",");
//            separate data using "," as a delimiter

            String name = reader.nextToken();
            String address = reader.nextToken();
            int age = Integer.parseInt(reader.nextToken());
//            get all information

            totalAge += age;
            counter++;
//            count number of users and add total age

            System.out.printf("%s lives at %s and is %s years old\n", name, address, age);
        }
        double avgAge = totalAge / counter;
        System.out.println("The Average age is " + avgAge);

        fileScanner.close();
    }
}
