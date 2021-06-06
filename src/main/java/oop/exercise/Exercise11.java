package oop.exercise;
import java.math.RoundingMode;
import java.util.Scanner;
import java.math.BigDecimal;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Joshua Federman
 */
public class Exercise11
{
    static Scanner input = new Scanner(System.in);

    public static String euroCount(){
        System.out.print("How many euros are you exchanging? ");
        return input.nextLine();
    }
    public static String exchangeRate(){
        System.out.print("What is the exchange rate? ");
        return input.nextLine();
    }
    public static void printRate(String eQ, String eCR){
        double euroQuantity = Double.parseDouble(eQ);
        double euroChangeRate = Double.parseDouble(eCR);
        double USD = euroQuantity * euroChangeRate;
        BigDecimal rUSD = new BigDecimal(USD);
        rUSD = rUSD.setScale(2, RoundingMode.CEILING);
        System.out.print(eQ + " euros at an exchange rate of " + eCR + " is\n"
                            + rUSD + " U.S. Dollars");
    }
    public static void main( String[] args ) {
        String euroQuantity = euroCount();
        String euroChangeRate = exchangeRate();
        printRate(euroQuantity, euroChangeRate);
    }
}