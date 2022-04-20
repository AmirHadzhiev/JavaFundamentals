package Arrays;

import java.util.Scanner;

public class CondenseArrayToNumber {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         String line = scanner.nextLine();
        String[] stringNumbers = line.split(" ");
        int [] numbers =  new int[stringNumbers.length];


        for (int i = 0; i < numbers.length; i++) {
                numbers[i] = Integer.parseInt(stringNumbers[i]);
        }

        for(int i = 0; i < numbers.length ; i++){

            int[] cond = new int[numbers.length - 1];

            for(int j = 0; j < numbers.length - 1; j++) {

                cond[j] = numbers[j] + numbers[j + 1];
            }

            numbers =  cond;




        }

        for (int i = 0; i < numbers.length ; i++) {
            System.out.print(numbers[i]);

        }




        


    }
}
