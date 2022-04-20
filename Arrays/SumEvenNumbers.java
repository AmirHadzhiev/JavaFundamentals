package Arrays;

import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String lineOfNumbers = scanner.nextLine();
        String[] stringOfNumbers = lineOfNumbers.split(" ");
        int[] numbers = new int[stringOfNumbers.length];

       int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(stringOfNumbers[i]);
           if (numbers[i]% 2==0) {
               sum+=numbers[i];
           }

        }
        System.out.println(sum);
    }
}