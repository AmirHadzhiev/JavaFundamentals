package AssociativeArrays;

import java.util.LinkedHashMap;

import java.util.Map;
import java.util.Scanner;

public class LegandaryFarming {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         String itemsWhoWins = "" ;

         boolean haveWinner = false;
        Map<String,Integer> items = new LinkedHashMap<>();
        items.put("shards",0);
        items.put("fragments",0);
        items.put("motes",0);
        while (!haveWinner){
             String[] data = scanner.nextLine().split(" ");


             for (int i = 0; i < data.length - 1; i+=2) {
                 int qantity = Integer.parseInt(data[i]);
                 String item = data[i+1].toLowerCase();
                 items.putIfAbsent(item,0);
                 items.put(item,items.get(item)+ qantity );
               // Shards", "Fragments", and "Motes" are
                 if (item.equals("shards")|| item.equals("fragments")|| item.equals("motes") ) {
                     if (items.get(item)>= 250){
                         items.put(item,items.get(item)- 250 );
                         itemsWhoWins=item;
                         haveWinner = true;
                         break;


                     }


                 }
             }

         }
        switch (itemsWhoWins) {
            case "shards":
                System.out.printf("Shadowmourne obtained!%n");
                        break;
            case "fragments":
                System.out.printf("Valanyr obtained!%n");
                break;
            case "motes":
                System.out.printf("Dragonwrath obtained!%n");
                break;

        };


       // System.out.printf("%s obtained!%n",itemsWhoWins);
        for (Map.Entry<String, Integer> entry : items.entrySet()) {
            System.out.printf("%s: %d%n",entry.getKey(),entry.getValue());

        }


    }
}
