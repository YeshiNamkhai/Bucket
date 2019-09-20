package src.more;

import java.util.Scanner;

/**
 * The formula for BMI is weight in kilograms divided by height in meters squared. 
 * Formula: weight (kg) / [height (m)]2
 * 
 * @author Yeshi namkhai
 */

public class BMI{

    static void empyLine(){
        System.out.println();
    }

    static void line(char c, int times){
        for(int i=0;i<times;i++){
            System.out.print(c);
        }
        empyLine();
    }

    static void output(String s){
        System.out.println(s);
    }

    static float bmiCompute(float weight, float height){
        return weight/(height*height);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        empyLine();
        empyLine();
        line('*',25);
        output("BMI calculator");
        line('*',25);

        System.out.print("What is your weight in kg? ");
        float w=input.nextFloat(); //in kg
        System.out.print("What is your height in m? ");
        float h=input.nextFloat(); //in m

        output("BMI is "+bmiCompute(w,h));
        empyLine();
        empyLine();
    }



}