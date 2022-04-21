package ArraysExersice;

import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        String[] numbers = scanner.nextLine()
                .split(" ");int n = Integer.parseInt(scanner.nextLine());


        for (int j = 0; j < n; j++) {
            String furstnumber = numbers[0];

        for (int i = 0; i < numbers.length-1; i++) {

            numbers[i]=numbers[i+1];
        }
        numbers[numbers.length-1]= furstnumber;
        }


        for (int i = 0; i <numbers.length ; i++) {
            System.out.print(numbers[i]+" ");
        }


    }
}
