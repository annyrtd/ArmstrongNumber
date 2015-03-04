package com.company;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Kozlova2
 */
public class ArmstrongNumber {

    /** Check if a number is an Armsrong number.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print(" Hello! Please, input a number and I'll tell you whether it is an Armstrong number or not.\n");
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

    public static boolean isArmstrong(int n) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        int m = n;
        int i;
        for (i = 0; m > 0; i++) {
            nums.add(m % 10);
            m /= 10;
        }

        for (int j = 0; j < i; j++) {
            m += Math.pow(nums.get(j), i);
        }

        return m == n;
    }
}