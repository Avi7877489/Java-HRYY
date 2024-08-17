package Arrays;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        /*
        Classroom of 500 students - you have store markes of these 500 students
        you have 2 options:

        1. Create 500 variables
        2. Use Arrays (recommended)
         */
// There are three main ways ti crete an array in java

//        1. Declaration and then memory allocation
//        int[] marks = new int[5];

//        2. Declaration and then memory allocation

//        int[] marks;
//        marks = new int[5];

        // Initialization

//        marks[0] = 100;
//        marks[1] = 60;
//        marks[2] = 70;
//        marks[3] = 90;
//        marks[4] = 86;
//        marks[5] = 96; //-  throws an error;

        //  3. Declaration, memory allocation and initialization together

        int[] marks = {100, 45, 79, 99, 88};
        System.out.println(marks.length);

    }
}
