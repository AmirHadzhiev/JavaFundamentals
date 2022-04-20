package Arrays;

import java.util.Scanner;

public class ReverseArrayOfStrings {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         String line = scanner.nextLine();
        String[] stringMasive = line.split(" ");
        for (int i = stringMasive.length - 1; i >=0 ; i--) {
            System.out.print(stringMasive[i]+" ");

        }



    }
}
