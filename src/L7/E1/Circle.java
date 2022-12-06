package L7.E1;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public String toString() {
        return String.format("Circle[radius=%s]", this.radius);
    }

    public double getArea() {
        return (Math.pow(this.radius, 2) * Math.PI);
    }
}
