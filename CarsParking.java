package AssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CarsParking {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         int n = Integer.parseInt(scanner.nextLine());
        Map<String,String> ParkingData = new LinkedHashMap<>();

        for (int i = 0; i < n ; i++) {
            String [] line = scanner.nextLine().split(" ");
            String username = line[1];


            switch (line[0]){

                case "register":
                    String license = line[2];

                    if (ParkingData.containsKey(username)){

                        System.out.printf("ERROR: already registered with plate number %s%n",license);
                    } else {
                       ParkingData.put(username,license);
                        System.out.printf("%s registered %s successfully%n",username,license);
                    }

                    break;
                case "unregister":

                    if (ParkingData.containsKey(username)){
                        System.out.printf("%s unregistered successfully%n",username);
                        ParkingData.remove(username);
                    } else {
                        System.out.printf("ERROR: user %s not found%n",username);
                    }

                    break;
            }



        }
        for (Map.Entry<String, String> entry : ParkingData.entrySet()) {
            System.out.printf("%s => %s%n",entry.getKey(),entry.getValue());

        }


    }
}
