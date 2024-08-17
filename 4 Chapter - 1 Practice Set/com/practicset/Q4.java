package com.practicset;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner intput = new Scanner(System.in);
        // write a java program to convert kilometer to miles.
        System.out.println("Enter distance in kilometers: ");
        double Kilometer = intput.nextDouble();
        double miles = Kilometer * 0.621371;
        System.out.println(Kilometer  + " kilometer is equal to " + miles + " miles.");
    }
}



