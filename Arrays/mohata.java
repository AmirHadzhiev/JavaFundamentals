package Arrays;

import java.util.Scanner;

public class mohata {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] stringOfNumbers = line.split(" ");
        int[] numbers = new int[stringOfNumbers.length];
         int[] paziduljinata = new int[0];
         int sum = 0;

         for (int i = 0; i < numbers.length -1 ; i++) {
            numbers[i]= Integer.parseInt(stringOfNumbers[i]);
            if (numbers[i]<numbers[i+1]){
                sum=numbers[i];
            }

        }

        System.out.println(paziduljinata);
    }
}
