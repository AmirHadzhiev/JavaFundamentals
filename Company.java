import java.util.Scanner;

public class Company {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         //•	На първия ред са необходимите часовете – цяло число в интервала [0 ... 200 000]
        //•	На втория ред са дните, с които фирмата разполага – цяло число в интервала [0 ... 20 000]
        //•	На третия ред е броят на служителите, работещи извънредно – цяло число в интервала [0 ... 200]
        int needHours = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());
        int bonusworkers = Integer.parseInt(scanner.nextLine());
        double hours = days * 8;
        hours = hours - hours * 0.10;
        hours = bonusworkers * 2 * days + hours;
        hours = Math.floor(hours);
        if (hours>=needHours){
            System.out.printf("Yes!%.0f hours left.",hours - needHours);
        } else {
            System.out.printf("Not enough time!%.0f hours needed.",needHours - hours);
        }




    }
}
