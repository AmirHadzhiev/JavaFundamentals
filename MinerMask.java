package AssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MinerMask {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         String line = scanner.nextLine();
        Map<String,Integer> data = new LinkedHashMap<>();
        int count = 1;
        String metal = "";
         while (!line.equals("stop")){

          int quantity = 0;

             if (count%2==0){
                 quantity= Integer.parseInt(line);
             } else {
                 metal=line;
             }
             if (!data.containsKey(metal)){
                 data.put(metal,quantity);
             } else {
                 data.put(metal,data.get(metal)+quantity);
             }
             count++;
             line= scanner.nextLine();
         }

      // for (Map.Entry<String, Integer> entry : data.entrySet()) {
        //    System.out.printf("$s -> %d%n",entry.getKey(),entry.getValue());

        //}
        data.forEach((key,value) -> System.out.printf("%s -> %d%n",key,value));


    }
}
