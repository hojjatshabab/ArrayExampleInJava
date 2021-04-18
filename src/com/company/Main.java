package com.company;

import java.util.Scanner;

/*
 * Author: Hojjat Shabab
 *
 * Created on April 18, 2021, 02:10 PM
 */
public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner myScanner = new Scanner(System.in);
        System.out.println("welcome to the sum and avrage progrm....");
        outter:
        while (true) {
            System.out.print("please enter length for Array=");
            int num = myScanner.nextInt();
            String[] array = new String[num];
            System.out.println("Please enter your desired string");
            for (int i = 0; i < array.length; i++) {
                System.out.print("Array[" + i + "]=");
                String str = myScanner.next();
                array[i] = str;
            }
            System.out.println("please enter your number");
            System.out.println("Enter number (1) if you want to perform the addition operation");
            System.out.println("Enter number (2) if you want to perform the avrage operation");
            int code = myScanner.nextInt();
            switch (code) {
                case 1:
                    int sum = addition(array);
                    System.out.println("Total length of strings is " + sum);
                    break;
                case 2:
                    int avg = avrage(array);
                    System.out.println("Avreage length of strings is " + avg);
                    break;
                default:
                    System.out.println("Please enter the correct phrase (1 and 2)");

            }
            System.out.println("If you want to finish running the program, type \"exit\"");
            for (String str :
                    array) {
                if (str.contains("exit"))
                    break outter;
            }
        }
    }

    public static int addition(String[] array) {
        int sum = 0;
        for (String str : array) {
            sum += str.length();
        }
        return sum;
    }

    public static int avrage(String[] array) {
        return addition(array) / array.length;
    }
}

