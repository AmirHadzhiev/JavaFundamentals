package AssociativeArrays;

import java.util.*;

public class StudentAcademy {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<Double>> studentList = new LinkedHashMap<>();

        for (int i = 0; i < n ; i++) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());



            if (studentList.containsKey(name)){
                studentList.get(name).add(grade);
            } else {
                studentList.put(name,new ArrayList<>());
                studentList.get(name).add(grade);
            }

        }
        studentList.forEach((key, value) -> {
            double avrg = value
                    .stream()
                    .mapToDouble(x -> x)
                    .average()
                    .orElse(0.0);
          if (avrg>=4.50){
            System.out.printf("%s -> %.2f%n", key, avrg);
          }
        });
    }
}
