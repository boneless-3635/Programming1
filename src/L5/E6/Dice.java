package L5.E6;

public class Dice {
    private int value;

    public Dice() {
        this.value = 1;
    }

    public void roll() {
        this.value = (int) (Math.random() * 6 + 1);
    }

    public int getValue() {
        return value;
    }
}
