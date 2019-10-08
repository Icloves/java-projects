package com.company;

import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;


public class Array
{

    static void UserInput()
    {

        System.out.println("Hello Ilya");
    }
//
//
    static void UserInput(int b)
    {
        int myArray[] = new int[b];
        for (int i = 0; i < b; i++) {
            System.out.println("Enter " + i + " element");
            myArray[i] = scanner.nextInt();
        }
        //System.out.println(Arrays.toString(myArray));
    }
//    static void RandomInput(Scanner scanner, int a)
//    {
////        Scanner scanner = new Scanner(System.in);
////        int a = scanner.nextInt();
////        int b = scanner.nextInt();
////        int [] myArray = new int[a];
//        for (int i = 0; i < myArray.length; i++)
//            myArray[i] = (int)(Math.random() * a);
//        System.out.println(Arrays.toString(myArray));
//    }

}
