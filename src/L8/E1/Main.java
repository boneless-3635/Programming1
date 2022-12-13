package L8.E1;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name = scan.nextLine();
        System.out.println("Please enter your address");
        String address = scan.nextLine();
        System.out.println("Please enter your age");
        int age = scan.nextInt();

        PrintWriter pw = new PrintWriter(new FileWriter("src/L8/E1/users.txt", true));
//        create a PrintWriter to write to the file
        pw.println(name + "," + address + "," + age);
//        Write to file
        pw.flush();
        pw.close();
        }
}
