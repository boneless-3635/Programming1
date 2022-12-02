package L5.E6;

import java.util.Objects;
import java.util.Scanner;

public class Player {
    private String choice;
    private int bet;
    private int wallet;

    public Player(int wallet) {
        this.wallet = wallet;
    }

    public String getChoice() {
        return choice;
    }

    public void setChoice() {
        while (true) {
            Scanner choiceScan = new Scanner(System.in);
            System.out.println("Please choose big or small");
            String choice = choiceScan.nextLine();
            if ((Objects.equals(choice, "big")) || (Objects.equals(choice, "small"))) {
                this.choice = choice;
                System.out.println("You have chosen " + getChoice());
                break;
            } else {
                System.out.println("Invalid choice");
            }
        }
    }

    public int getBet() {
        return bet;
    }

    public void setBet() {
        int intValue;
        boolean validBet = false;

        while (!validBet) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Please choose your bet amount");
            String bet = scan.nextLine();
            if (bet == null || bet.equals("")) {
                System.out.println("You have bet 0");
            } else {
                try {
                    intValue = Integer.parseInt(bet);
                    if (getWallet() >= intValue) {
                        this.bet = intValue;
                        System.out.println("You have bet $" + intValue);
                        validBet = true;
                    } else {
                        System.out.println("Invalid bet");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid bet");
                }
            }
        }
    }

    public int getWallet() {
        return wallet;
    }

    public void addWallet(int wallet) {
        this.wallet += wallet;
    }
}
