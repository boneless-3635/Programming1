package L4;

public class Triangle {
    private int s1;
    private int s2;
    private int s3;

    public int getS1() {
        return s1;
    }

    public int getS2() {
        return s2;
    }

    public int getS3() {
        return s3;
    }

    public void setS1(int s1) {
        this.s1 = s1;
    }

    public void setS2(int s2) {
        this.s2 = s2;
    }

    public void setS3(int s3) {
        this.s3 = s3;
    }

    public String verify() {
        if (getS1() + getS2() >= getS3() && getS2() + getS3() >= getS1() && getS1() + getS3() >= getS2()) {
            if ((getS1() == getS2()) && (getS2() == getS3())) {
                return "Equilateral Triangle";
            } else if (getS1() == getS2() || getS2() == getS3() || getS1() == getS3()) {
                return "Isosceles Triangle";
            } else {
                return "Scalene Triangle";
            }
        } else {
            return "Not triangle";
        }
    }
}
