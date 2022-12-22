package L9.E2;

public abstract class Shape {
    protected String color;
    protected Boolean filled;

    public Shape() {
        this.color = "red";
        this.filled = true;
    }

    public Shape(String color, Boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public abstract double getArea();
    public abstract double getPerimeter();

    public String toString() {
        return String.format("Shape[color=%s,filled=%b]%n\n", this.color, this.filled);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean isFilled() {
        return filled;
    }

    public void setFilled(Boolean filled) {
        this.filled = filled;
    }
}
