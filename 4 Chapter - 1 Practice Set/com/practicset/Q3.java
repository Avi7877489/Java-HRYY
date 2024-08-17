package com.practicset;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
         write a java program which ask the user to enter his/her name and greets them with "Hello <name>
         have a good day" text.
        */
        System.out.println("What is your name: ");
        String name = input.next();
        System.out.println("Hello "  + name + " have a good day!");

    }

}
