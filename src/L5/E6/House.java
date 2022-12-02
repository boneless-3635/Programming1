package L5.E6;

public class House {
    private static final byte MIN_SMALL = 4;
    private static final byte MAX_SMALL = 11;
    private int wallet;
    private Dice[] dices;

    public House(int wallet) {
        this.wallet = wallet;
        this.dices = new Dice[3];
    }

    public void rollDices() {
        dices[0].roll();
        dices[1].roll();
        dices[2].roll();
    }

    public void printDices() {
        System.out.println("You rolled:");
        System.out.println(dices[0].getValue() + " " + dices[1].getValue() + " " + dices[2].getValue());
        System.out.println("The sum of 3 dices are");
        System.out.println(sumDices());
    }

    public int sumDices() {
        return dices[0].getValue() + dices[1].getValue() + dices[2].getValue();
    }

    public Dice[] getDices() {
        return dices;
    }

    public String checkDicesResult() {
        if (dices[0].getValue() == dices[1].getValue() && dices[1].getValue() == dices[2].getValue()) {
            return "same";
        } else if (sumDices()>=MIN_SMALL && sumDices()<=MAX_SMALL) {
            return "small";
        } else {
            return "big";
        }
    }

    public int getWallet() {
        return wallet;
    }

    public void addWallet(int amount) {
        wallet += amount;
    }
}
