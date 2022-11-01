package L2;

public class E5 {
    public static void main(String[] args) {
        int[] numberCounter = new int[10];
        for (int i = 0; i < 10; i++) {
            int randomNum = (int) (Math.random() * (10));
            numberCounter[randomNum]++;
        }
        System.out.println();
    }
}
