package L6.E3;

public class Square extends Rectangle{
    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    public Square(double side) {
        super(side, side);
    }

    public Square() {
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide() {

    }
}
