import java.util.Scanner;

public class Pets {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         //•	Първи ред – брой дни – цяло число в интервал [1…5000]
        //•	Втори ред – оставена храна в килограми – цяло число в интервал [0…100000]
        //•	Трети ред – храна на ден за кучето в килограми – реално число в интервал [0.00…100.00]
        //•	Четвърти ред – храна на ден за котката в килограми– реално число в интервал [0.00…100.00]
        //•	Пети ред – храна на ден за костенурката в грамове – реално число в интервал [0.00…10000.00]
        int numberofdays = Integer.parseInt(scanner.nextLine());
        int foodKG = Integer.parseInt(scanner.nextLine());
        double foodforDOG = Double.parseDouble(scanner.nextLine());
        double foodforCAT = Double.parseDouble(scanner.nextLine());
        double foodgramsTURTLE = Double.parseDouble(scanner.nextLine());
        double dogfood =numberofdays * foodforDOG;
        double catfood = numberofdays * foodforCAT;
        double tutlefood = (numberofdays * foodgramsTURTLE) / 1000;
        double allfood = dogfood + catfood + tutlefood;
        if (allfood<=foodKG) {
           double print = foodKG - allfood;
            System.out.printf("%.0f kilos of food left.",Math.floor(print));
        } else {
            double print2 =allfood - foodKG;
            System.out.printf("%.0f more kilos of food are needed.",Math.ceil(print2));
        }

    }
}
