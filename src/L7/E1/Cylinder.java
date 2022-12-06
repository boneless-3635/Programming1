package L7.E1;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double height, double radius) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return super.getArea() * this.height;
    }

    public double getArea() {
        return 2 * Math.PI * super.getRadius() * this.height + 2 * super.getArea();
    }

    public String toString() {
        return String.format("Cylinder[radius=%s, height=%s]", super.getRadius(), this.height);
    }
}
