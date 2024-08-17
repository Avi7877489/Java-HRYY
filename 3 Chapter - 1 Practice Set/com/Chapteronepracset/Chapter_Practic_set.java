package com.Chapteronepracset;

import java.util.Scanner;

public class Chapter_Practic_set {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        if (age >= 18) {
            System.out.println("you can drive");
        } else if (age == 0) {
            System.out.println("Are you kidding");

        } else if (age == 1) {
            System.out.println("Are you again kidding ");
        } else {
            System.out.println("you can not drive");
        }

        // if else short cut

        int a = input.nextInt();
        int b = input.nextInt();
        int c = a > b ? (a - b) : (b - a);
        System.out.println(c);


    }
}
