package com.company;

import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;
import java.lang.String;

public class Array
{
    Scanner scanner = new Scanner(System.in);
    static int myArray[];

    void UserInput(int b)
    {
        myArray = new int[b];
        for (int i = 0; i < b; i++) {
            System.out.println("Enter " + i + " element");
            myArray[i] = scanner.nextInt();
        }
    }

    void RandomInput(int b)
    {
        myArray = new int [b];
        for (int i = 0; i < myArray.length; i++)
            myArray[i] = (int)(Math.random() * b);

    }

    void IndexlessInput() {
        for (int v : myArray)
            System.out.println(v);
    }

    void RevArray() {
        for (int i = myArray.length - 1; i >= 0 ; i--)
            System.out.println(myArray[i] + " ");

    }

    void Digit(int a) {
        int count = 0;
        int j = 1;

        while (a-- > 0)
             j = j * 10;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] >= j) {
                myArray[i] = myArray[i] / 10;
                count++;
            }
        }
        System.out.println("You have reduced " + count + " discharge");
    }

    void toHexString()
    {
        String hexArray[] = new String[myArray.length];
        int a = 0;
        for (int i = 0; i < myArray.length; i++) 
                hexArray[i] = Integer.toHexString(myArray[i]);
        String myArray2[] = new String[5];
        for (int i = 0; i < hexArray.length; i++) {
            for (int j = 0; j < hexArray[i].length(); j++) {
                if (hexArray[i].charAt(j) >= 'a' && hexArray[i].charAt(j) <= 'f') {
                    myArray2[a] = hexArray[i];
                    a++;
                }
            }
        }
        System.out.println(Arrays.toString(myArray2));
    }
}
