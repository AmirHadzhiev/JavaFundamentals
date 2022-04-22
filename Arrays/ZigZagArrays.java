package ArraysExersice;

import java.util.Arrays;
import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         int n = Integer.parseInt(scanner.nextLine());

         String[] furstAray = new String[n];
        String[] secondAray = new String[n];

        for (int i = 1; i <= n; i++) {
            String[] numbers = scanner.nextLine().split(" ");

           if (i%2 !=0){
           furstAray[i-1]= numbers[0];
           secondAray[i-1]= numbers[1];

            } else {
               secondAray[i-1] = numbers[0];
               furstAray[i-1] = numbers[1];
            }

        }


        Arrays.stream(furstAray).map(s -> s + " ").  forEach(System.out::print);
        System.out.println();
        Arrays.stream(secondAray).map(s -> s + " ").forEach(System.out::print);


    }
}
