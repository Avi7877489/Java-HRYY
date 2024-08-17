package com.practicset;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // write a program to calculate CGPA using marks of the three subjects (out of 100)
//        int subject1 = 45;
//        int subject2 = 95;
//        int subject3 = 48;
//        double totalmarks = (subject1 + subject2 + subject3) / 3;
//        double cgpa = totalmarks / 10;
//        System.out.println(cgpa);

        float subject1 = 45;
        float subject2 = 95;
        float subject3 = 48;
        float cgpa = (subject1 + subject2 + subject3) / 30;
        System.out.println(cgpa);
    }
}
