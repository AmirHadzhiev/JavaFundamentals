package ArraysExersice;

import java.util.Scanner;

public class elements {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        String[] stringMasive = scanner.nextLine().split(" ");
 
        String[] stringMasive2 = scanner.nextLine().split(" ");

        for (int i = 0; i <stringMasive2.length ; i++) {
            for (int j = 0; j <stringMasive.length ; j++) {
                if (stringMasive2[j].equals(stringMasive[j])){
                    System.out.print(stringMasive[j]+" ");
                }
            }
        }


    }
}
