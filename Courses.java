package AssociativeArrays;

import java.util.*;

public class Courses {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         String line = scanner.nextLine();
        Map<String, List<String>> courses = new LinkedHashMap<>();

         while (!line.equals("end")){
            String[] data = line.split(" : ");
            String courseName = data[0];
            String studentName = data[1];
           if (courses.containsKey(courseName)){
               courses.get(courseName).add(studentName);
           } else {
               courses.put(courseName,new ArrayList<>());
               courses.get(courseName).add(studentName);
           }



             line= scanner.nextLine();
         }
        for (Map.Entry<String, List<String>> entry : courses.entrySet()) {
            System.out.printf("%s: %s%n",entry.getKey(),entry.getValue().size());
            for (String s : entry.getValue()) {
                System.out.printf("-- %s%n",s);

            }

        }

    }
}
