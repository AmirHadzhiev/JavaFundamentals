package ArraysExersice;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceEqualElements {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        int[] inputArr = Arrays.stream(scanner.nextLine()
                .split(" ")).
                mapToInt(Integer::parseInt).toArray();
        int count = 1;
        int sumcount=0;
        int numbertoprint=0;

        for (int i = 0; i <inputArr.length-1 ; i++) {

            if (inputArr[i]==inputArr[i+1]){
                count+=1;
                if (count>sumcount){
                    sumcount=count;
                    numbertoprint=inputArr[i];
                }

            } else {
                count=1;
            }

        }
        for (int i = 0; i <sumcount ; i++) {
            System.out.print(numbertoprint+" ");
        }



    }
}
