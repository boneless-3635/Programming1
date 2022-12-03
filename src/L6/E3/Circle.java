package L6.E3;

import java.lang.Math;

public class Circle extends Shape{
    private double radius;

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
        this.radius = 1;
    }

    public String toString() {
        return String.format("Circle[%s], radius = %s", super.toString(), radius);
    }

    public double getPerimeter() {
        return radius * 2 * Math.PI;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

}
