package L1;

public class E5 {
    public static void main(String[] args) {
//        Convert miles to kilometers
        System.out.printf("Miles\t\tKilometers\n");
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%d\t\t\t%.2f\n", i, i*1.609344);
        }

//        Convert kilometers to miles
        System.out.printf("\nKilometers\tMiles\n");
        for (int i = 20; i <= 65; i+=5) {
            System.out.printf("%d\t\t\t%.2f\n", i, i/1.609344);
        }
    }
}
