package L4;

public class TestPoint2D {
    public static void main(String[] args) {
        Point2D p1 = new Point2D();
        System.out.printf("The initial value of p1: %s\n", p1);
        System.out.printf("Is p1 at the origin?: %s\n", p1.isOrigin());
        System.out.println("Change the value of p1: ");
        p1.input();
        System.out.printf("The new value of p1: %s\n", p1);

        Point2D p2 = new Point2D(4,7);
        System.out.printf("The value of p2: %s\n", p2);
        Point2D p3 = new Point2D(p2);
        System.out.printf("The value of p3: %s\n", p3);
        p3.move(6, 2);
        System.out.printf("The new value of p3: %s\n", p3);

        System.out.printf("First way to calculate distance between p1 and p2: %.2f\n", p1.distance(p2));
        System.out.printf("Second way to calculate distance between p1 and p2: %.2f\n", Point2D.distance(p1, p2));
        System.out.printf("First way to calculate distance between p2 and p3: %.2f\n", p2.distance(p3));
        System.out.printf("Second way to calculate distance between p2 and p3: %.2f\n", Point2D.distance(p2, p3));

    }
}
