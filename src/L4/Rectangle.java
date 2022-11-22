package L4;

public class Rectangle {
    private int width;
    private int height;

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public Rectangle(int widthInp, int heightInp) {
        if (widthInp >= 0 && heightInp >= 0) {
            setHeight(heightInp);
            setWidth(widthInp);
        } else {
            System.out.println("Invalid width or height");
        }
    }

    public void visualize(int widthVis, int heightVis) {
        for (int i = 0; i < heightVis; i++) {
            for (int j = 0; j < widthVis; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
