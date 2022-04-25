package AssociativeArrays;

import java.util.*;

public class CompanyUsers {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         String line = scanner.nextLine();
        Map<String, List<String>> companyData = new LinkedHashMap<>();

         while (!line.equals("End")){
             String[] data = line.split(" -> ");
             String key = data[0];
             String id = data[1];
             companyData.putIfAbsent(key,new ArrayList<>());
             if (!companyData.get(key).contains(id)){
                 companyData.get(key).add(id);}







             line= scanner.nextLine();
         }
        for (Map.Entry<String, List<String>> entry : companyData.entrySet()) {
            System.out.printf("%s%n",entry.getKey());
            for (String s : entry.getValue()) {
                System.out.printf("-- %s%n",s);

            }


        }


    }
}
