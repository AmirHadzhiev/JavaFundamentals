package Arrays;

import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         
        String line1 = scanner.nextLine();
        String line2 = scanner.nextLine();

        String[] stringFurstline= line1.split(" ");
        String[] stringsSecondine = line2.split(" ");
        int [] numberFurstline =  new int[stringFurstline.length];
        int [] numberSecondline =  new int[stringsSecondine.length];

        int sumfurst =0;

        int[] numbers = new int[stringFurstline.length];
        for (int i = 0; i < numberFurstline.length; i++) {
            numberFurstline[i]=Integer.parseInt(stringFurstline[i]);
            sumfurst+=numberFurstline[i];
        }
        for (int i = 0; i < numberSecondline.length; i++) {
            numberSecondline[i]=Integer.parseInt(stringsSecondine[i]);
        }
        boolean euqlsOrNot = false;
        int wrongnumberplace = 0;

        for (int i = 0; i <numberFurstline.length ; i++) {
            if (numberFurstline[i]==numberSecondline[i]) {
                euqlsOrNot=true;
            } else {
                wrongnumberplace+=i;
                euqlsOrNot=false;
                break;

            }

        }

         if (euqlsOrNot){
             System.out.println("Arrays are identical. Sum: "+sumfurst);
         }  else {
             System.out.println("Arrays are not identical. Found difference at "+ +wrongnumberplace+  " index.");
         }

    }
}
