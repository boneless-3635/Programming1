package L5.E6;

import java.util.Objects;
import java.util.Scanner;

public class BigSmallGame {
   public static void main(String[] args) {

      Player player = new Player(100);
      House house = new House(1000);
      int round = 1;

      System.out.println("The player has $" + player.getWallet());
      System.out.println("The house has $" + house.getWallet());

      while (true) {
         System.out.println("Round " + round);

         player.setChoice();
         player.setBet();

         house.rollDices();
         house.printDices();

         if (Objects.equals(player.getChoice(), house.checkDicesResult())) {
            System.out.println("You won $" + player.getBet());
            player.addWallet(player.getBet());
            house.addWallet(-player.getBet());
         } else {
            System.out.println("You lost $" + player.getBet());
            house.addWallet(player.getBet());
            player.addWallet(-player.getBet());
         }

         System.out.println("The player has $" + player.getWallet());
         System.out.println("The house has $" + house.getWallet());

         if (player.getWallet() == 0) {
            System.out.println("You have ran out of money");
            break;
         } else {
            Scanner playScanner = new Scanner(System.in);
            System.out.println("Do you want to play again? (y/n)");
            if (Objects.equals(playScanner.nextLine(), "n")) {
               break;
            } else {
               round += 1;
            }
         }
      }

   }
}
