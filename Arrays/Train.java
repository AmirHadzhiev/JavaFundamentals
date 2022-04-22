package ArraysExersice;

import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         int n = Integer.parseInt(scanner.nextLine());


         int sum= 0;
         int[] people1 = new int[n];


        for (int i = 0; i < people1.length; i++) {
            people1[i]= Integer.parseInt(scanner.nextLine());
            sum+=people1[i];
        }

        for (int i = 0; i < people1.length; i++) {
            System.out.print(people1[i]+" ");
        }

        System.out.printf("%n%d",sum);



    }
}
