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

    public static double euroCount(){
        System.out.print("How many euros are you exchanging? ");
        return input.nextFloat();
    }
    public static double exchangeRate(){
        System.out.print("What is the exchange rate? ");
        return input.nextFloat();
    }
    public static void printRate(double euroQuantity, double euroChangeRate){

        double USD = euroQuantity * euroChangeRate;
        BigDecimal rUSD = new BigDecimal(USD);
        rUSD = rUSD.setScale(2, RoundingMode.CEILING);
        System.out.printf("%.2f euros at an exchange rate of %f is %.2f U.S. Dollars",
                euroQuantity, euroChangeRate, rUSD);
    }
    public static void main( String[] args ) {
        double euroQuantity = euroCount();
        double euroChangeRate = exchangeRate();
        printRate(euroQuantity, euroChangeRate);
    }
}