package com.Exercise;

import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Let's Calculate Result % :");
        System.out.print("Enter First Subject no: ");
        int a = input.nextInt();
        System.out.print("Enter Second Subject no: ");
        int b = input.nextInt();
        System.out.print("Enter Third Subject no: ");
        int c = input.nextInt();
        System.out.print("Enter Forth Subject no: ");
        int d = input.nextInt();
        System.out.print("Enter Fifth Subject no: ");
        int e = input.nextInt();
        int totalmark = a + b + c + d + e;
        double percentage = (totalmark / 500.0) * 100;
        System.out.println("Total Marks:" + totalmark);
        System.out.println("Percentage: " + percentage + "%");

    }
}
