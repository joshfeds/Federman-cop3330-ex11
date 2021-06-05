package oop.exercise;
import java.util.Scanner;

public class Exercise11
{
    static Scanner input = new Scanner(System.in);
    public static float euroCount(){
        System.out.print("How many euros are you exchanging? ");
        return input.nextFloat();
    }
    public static float exchangeRate(){
        System.out.print("What is the exchange rate? ");
        return input.nextFloat();
    }
    public static void printRate(float euroQuantity, float euroChangeRate){
        float USD = euroQuantity * euroChangeRate;
        System.out.printf("%.2f euros at an exchange rate of %f is %.2f", euroQuantity, euroChangeRate, USD);
    }
    public static void main( String[] args ) {
        float euroQuantity = euroCount();
        float euroChangeRate = exchangeRate();
        printRate(euroQuantity, euroChangeRate);
    }
}