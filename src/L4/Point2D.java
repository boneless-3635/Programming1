package L4;

import java.util.Scanner;

public class Point2D {
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Point2D() {
        setX(0);
        setY(0);
    }

    public Point2D(int x, int y) {
        setX(x);
        setY(y);
    }

    public Point2D(Point2D p) {
        setX(p.getX());
        setY(p.getY());
    }

    public void input() {
        Scanner inp = new Scanner(System.in);
        setX(inp.nextInt());
        setY(inp.nextInt());
    }

    @Override
    public String toString() {
        return getX() + " " + getY();
    }

    public void move(int x, int y) {
        setX(x);
        setY(y);
    }

    public boolean isOrigin() {
        return getX() == 0 && getY() == 0;
    }

    public double distance(Point2D p) {
        return Math.sqrt(Math.pow(this.getX() - p.getX(), 2) + Math.pow(getY() - p.getY(), 2));
    }

    public static double distance(Point2D p1, Point2D p2) {
        return Math.sqrt(Math.pow(p1.getX() - p2.getX(), 2) + Math.pow(p1.getY() - p2.getY(), 2));

    }
}
