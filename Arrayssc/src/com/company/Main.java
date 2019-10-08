package com.company;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args) {
        Array array = new Array();
        Scanner scanner = new Scanner(System.in);
        int task;
        int digit;
        int point, t = 1;

        while (t == 1)
        {
            System.out.println("\n\nChoose number of task:\n" +
                "1.User and random input\n" +
                "2.Output array without index\n" +
                "3.Reverse output array\n" +
                    "4.Get lower number\n" +
                    "5.Hex radix\n" +
                    "6.Exit\n");
            task = scanner.nextInt();
            switch (task)
            {
                case 1: //Input
                    System.out.println("Choose what you want:\n" +
                            "1.Your input\n" +
                            "2.Random input");
                    point = scanner.nextInt();
                    //userinput
                    if (point == 1) {
                        System.out.println("Enter amount of array ");
                        point = scanner.nextInt();
                        array.UserInput(point);
                    }
                    //randominput
                    if (point == 2) {
                        System.out.println("Enter amount of random array ");
                        point = scanner.nextInt();
                        array.RandomInput(point);
                    }
                    break;

                case 2: //output
					System.out.println("Your array:");
                    array.IndexlessInput();
                    break;
                case 3: //revoutput
                    System.out.println("reverse array:");
                    array.RevArray();
                    break;
                case 4: //get lower num
                    System.out.println("Enter the number you want to lower");
                    digit = scanner.nextInt();
                    array.Digit(digit);
                    break;
                case 5: //hex radix
                    System.out.println("Enter amount of hex radix array");
                    array.toHexString();
                    break;
                case 6: //exit
                    t = 0;
                    break;
            }
        }
    }
}
