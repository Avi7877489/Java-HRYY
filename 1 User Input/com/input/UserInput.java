package com.input;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        System.out.println("Taking Input From User: ");
        Scanner input = new Scanner(System.in);
//        System.out.println("Enter Number 1 : ");
//        int a = input.nextInt();
//        float a = input.nextFloat();
//        System.out.println("Enter Number 2: " );
//        int b = input.nextInt();
//        float b = input.nextFloat();
//        int sum = a + b;
//        float sum = a + b;
//        System.out.println("The sum of this number: ");
//        System.out.println(sum);
//        boolean b1 = input.hasNextInt();
//        System.out.println(b1);
//        String scr = input.next();
        String scr = input.nextLine();
        System.out.println(scr);
    }
}
