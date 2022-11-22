package L3;

import java.util.Scanner;

public class E1_E5 {
//    E1
    public static void main(String[] args) {
//        prompt the user input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter how many random numbers to generate for the array: ");
        int arrLength = Integer.parseInt(input.next());

//        create array with length of the input
        int[] numArray = new int[arrLength];
        for (int i = 0; i < arrLength; i++) {
//            generate random integer from 0 to 10 and put them into the array
            numArray[i] = (int) (Math.random() * arrLength);

        }

//        randomize from value
        int fromLimiter = (int) (Math.random() * arrLength);

//        output array with enhanced for loop
        for (int j : numArray) {
            System.out.printf("%d ", j);
        }

        int[] newArr = exchangeMinFrom(numArray, fromLimiter);
        System.out.printf("\nindex from " + fromLimiter + "\n");
        for (int k : newArr) {
            System.out.printf("%d ", newArr[k]);
        }
//        System.out.println("\nSmallest number index is " + getIndexMin(numArray));
//        System.out.println("\nSmallest number index from " + fromLimiter + " is " + getIndexMinFrom(numArray, fromLimiter));

    }

//    E2
    public static int getIndexMin(int[] numbers) {
        int smallestIntIndex = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < numbers[smallestIntIndex]) {
                smallestIntIndex = i;
            }
        }
        return smallestIntIndex;
    }

//    E3
    public static int getIndexMinFrom(int[] numbers, int from) {
        int smallestIntIndex = from;

        if (from < numbers.length) {
            for (int j = from + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[smallestIntIndex]) {
                    smallestIntIndex = j;
                }
            }
        }

        return smallestIntIndex;
    }

//    E4
    public static int[] exchangeMinFrom(int[] numbers, int from) {
        int temp;

        int smallestIntIndex = getIndexMinFrom(numbers, from);


        temp = numbers[from];
        numbers[from] = numbers[smallestIntIndex];
        numbers[smallestIntIndex] = temp;

//        System.out.println("smallest " + numbers[from]);
//        System.out.println("sii " + smallestIntIndex);

        return numbers;
    }

//    int temp;
//    for (int i = 0; i < numbers.length; i++) {
//        for (int j = i + 1; j < numbers.length; j++) {
//            if (numbers[i] > numbers[j]) {
//                temp = numbers[i];
//                numbers[i] = numbers[j];
//                numbers[j] = temp;
//            }
//        }
//    }
}
