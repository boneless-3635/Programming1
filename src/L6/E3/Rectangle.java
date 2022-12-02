package L6.E3;

public class Rectangle extends Shape{
    private double width;
    private double length;

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle() {
        this.width = 1;
        this.length = 1;
    }

    public String toString() {
        return String.format("Rectangle[%s], width = %s, length = %s", super.toString(), width, length);
    }

    public double getPerimeter() {
        return (width + length) * 2;
    }

    public double getArea() {
        return width * length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
