package com.practicset;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        // write a java program to detect whether a number entered by the user is integer or not.

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        System.out.println(input.hasNextInt());
    }
}
