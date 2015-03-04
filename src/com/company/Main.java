package com.company;

import java.util.Scanner;
import java.util.ArrayList;

/**
 * Created by Anna Kozlova on 04.03.2015.
 */

public class Main {
    public Main() {
    }
    /** Check if a number is an Armstrong number.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print(" Hello! Please, input a number" +
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
            System.out.print("Number should be integer.\n");
            return;
        }
    }

    /**
     * Function checks if a number is an Armstrong number.
     * @param n a number that should be checked
     * @return true, if it is an Armstrong number, and false, otherwise.
     */
    public static boolean isArmstrong(int n) {
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
        int m = number;
        for (int i = 0; m > 0; i++) {
            array.add(m % 10);
            m /= 10;
        }
        return;
    }

    /**
     * @param array array of number digits.
     * @return sum of all digits raised to the power of digits' amount.
     */
    public static int countDigits(ArrayList<Integer> array) {
        int m = 0;
        int length = array.size();
        for (int i = 0; i < length; i++) {
            m += Math.pow(array.get(i), length);
        }
        return m;
    }
}