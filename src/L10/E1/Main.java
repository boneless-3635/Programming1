package L10.E1;

import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Loop until a valid file name is received
        while (true) {
//            Scanner to get user input
            Scanner fileSelect = new Scanner(System.in);
            System.out.println("Please enter the file name to read from");
            String fileName = fileSelect.nextLine();
            System.out.println(System.getProperty("user.dir"));

//            Scanner to open the file selected
            try (Scanner fileScanner = new Scanner(Paths.get("src/L10/E1/"+fileName))) {
//                Loop to output all the lines from the file
                while (fileScanner.hasNext()) {
                    String line = fileScanner.nextLine();
                    System.out.println(line);
                }
//                Break once every line are printed
                break;

//                Catch exception when there is no file found and output an error message
            } catch (Exception e) {
                System.out.println("File not found, please try again");
            }
        }
    }
}
