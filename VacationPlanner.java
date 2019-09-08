import java.util.Scanner;

public class VacationPlanner {

    public static void main(String[] args) {
        String info[] = intro();
        Object data[] = budget();

    }
    
    public static void stars(int n) {
        //prints in stars and skips a line
        for (int i = 0; i < n; i++) {
            System.out.print("*");
          }
        System.out.println();
        System.out.println();  
    }

    public static String[] intro() {
        //takes in username and destination
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Vacation Planner!");
        System.out.print("What is your name? ");
        String name = input.nextLine();
        System.out.print("Nice to meet you "+name+", where are you traveling to? ");
        String place = input.nextLine();
        System.out.println("Great "+place+", sounds like a great trip");
        stars(11);
        return new String[]{name, place};
    }

    public static Object[] budget() {
        //takes in days planned on trip, allowance, and converting info
        Scanner input = new Scanner(System.in);
        System.out.print("How many days are you going to spend travelling? ");
        int days = input.nextInt();
        System.out.print("How much money, in USD, are you planning to spend on your trip? ");
        int money = input.nextInt();
        System.out.print("What is the three letters currency symbol for your travel destination? ");
        String curr = input.next();
        System.out.print("How many "+curr+" are there in 1 USD? ");
        double rate = input.nextDouble();
        System.out.println();
        int hrs = days*24;
        int mns = hrs*60;
        double moneyPerDay = Math.round(money/days);
        double moneyLocal = Math.round(money*rate);
        double moneyLocalPerDay = Math.round(moneyLocal/days);
        System.out.println("If you are traveling for "+days+" days that is the same as "+hrs+" or "+mns+" minutes");
        System.out.println("If you are going to spend $"+money+" USD that means per day you can spend up to $"+moneyPerDay+" USD");
        System.out.println("Your total budget in "+curr+" is "+moneyLocal+" "+curr+", which per day is "+moneyLocalPerDay+" "+curr);
        System.out.print("OK");
        stars(11);
        return new Object[]{days, money, curr, rate};
    }
    
    public static void time() {
        //takes in the time difference between home and destination
        stars(11);
    }

    public static void distances() {
        //takes in distance between home and destination in square kilometers and
        //converts it into square miles

        //kilometers*0.62137 = miles
        stars(11);
    }
}