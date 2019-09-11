package src.people;

import java.util.Scanner;

public class VacationPlanner {

    public static void main(String[] args) {
        //String info[] = intro();
        //Object data[] = budget();

        intro();
        budget();
        time();
        distances();
    }
    
    public static void stars(int n) {
        //prints in stars and skips a line
        for (int i = 0; i < n; i++) {
            System.out.print("*");
          }
        System.out.println();
        System.out.println();  
    }

    public static void intro() {
    //public static String[] intro() {
        //takes in username and destination
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Vacation Planner!");
        System.out.print("What is your name? ");
        String name = input.nextLine();
        System.out.print("Nice to meet you "+name+", where are you traveling to? ");
        String place = input.nextLine();
        System.out.println("Great "+place+", sounds like a great trip");
        stars(11);
    //return new String[]{name, place};
    }

    public static void budget() {
    //public static Object[] budget() {
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
        double moneyPerDay = ((double)money/(double)days)*100;
        moneyPerDay = (int)moneyPerDay/100.0;
        double moneyLocal = ((double)money*rate)*100;
        moneyLocal = (int)moneyLocal/100.0;
        double moneyLocalPerDay = (moneyLocal/(double)days)*100;
        moneyLocalPerDay = (int)moneyLocalPerDay/100.0;
        System.out.println("If you are traveling for "+days+" days that is the same as "+hrs+" or "+mns+" minutes");
        System.out.println("If you are going to spend $"+money+" USD that means per day you can spend up to $"+moneyPerDay+" USD");
        System.out.println("Your total budget in "+curr+" is "+moneyLocal+" "+curr+", which per day is "+moneyLocalPerDay+" "+curr);
        stars(11);
        //return new Object[]{days, money, curr, rate};
    }
    
    public static void time() {
        //takes in the time difference between home and destination
        Scanner input = new Scanner(System.in);
        System.out.print("What is the time difference, in hours, between your home and your destination? ");
        int hrs = input.nextInt();
        int destTimeMid = (24+hrs)%24;
        int destTimeNoon = (12+hrs)%24;
        System.out.println("That means that when it is midnight at home it will be "+destTimeMid+":00 in your travel destination");
        System.out.println("and when it is noon at home it will be "+destTimeNoon+":00");
        stars(11);
    }

    public static void distances() {
        //takes in distance between home and destination in square kilometers and
        //converts it into square miles
        Scanner input = new Scanner(System.in);
        System.out.print("What is the square area of your destination country in km2? ");
        double destKM = input.nextDouble();
        double destMiles = (0.62137*0.62137)*destKM*10;
        destMiles=(int)destMiles/10.0;
        System.out.println("In miles2 that is "+destMiles);
        //kilometers*0.62137 = miles
        stars(11);
    }
}