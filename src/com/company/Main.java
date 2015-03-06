package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * Created by Anna Kozlova on 04.03.2015.
 */

public class Main {
    /**
     * Check if a number is an Armstrong number.
     * @param args the command line arguments.
     */
    public static void main(String[] args) {
        System.out.print(" Hello! Please, input a natural number" +
                " and I'll tell you whether it is an Armstrong number or not.\n");
        Scanner in = new Scanner(System.in);
        try {
            int k = in.nextInt();
            if (isArmstrong(k)) {
                System.out.print(k + " is an Armstrong number!\n");
            } else {
                System.out.print(k + " is not an Armstrong number!\n");
            }
        } catch (java.util.InputMismatchException e) {
            System.out.print("This is not an natural number.\n");
        }
    }

    /**
     * Function checks if a number is an Armstrong number.
     * @param n a number that should be checked.
     * @return true, if it is an Armstrong number, and false, otherwise.
     */
    public static boolean isArmstrong(int n) {
        if (n <= 0) {
            throw new InputMismatchException();
        }
        ArrayList<Integer> digits = new ArrayList<Integer>();
        divideIntoDigits(n, digits);
        return countDigits(digits) == n;
    }

    /**
     * This function divides a number into different digits.
     * @param number number, which is divided.
     * @param array array of digits of this number.
     */
    public static void divideIntoDigits(int number, ArrayList<Integer> array) {
        int temp = number;
        while (temp > 0) {
            array.add(temp % 10);
            temp /= 10;
        }
    }

    /**
     * @param array array of number digits.
     * @return sum of all digits raised to the power of digits' amount.
     */
    public static int countDigits(ArrayList<Integer> array) {
        int returnValue = 0;
        int pow = array.size();
        for (Integer anArray : array) {
            returnValue += Math.pow(anArray, pow);
        }
        return returnValue;
    }
}