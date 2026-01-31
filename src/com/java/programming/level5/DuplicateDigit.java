package com.java.programming.level5;

import java.util.Scanner;

public class DuplicateDigit {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        long num = sc.nextLong();

        int[] count = new int[10];

        while (num > 0) {
            count[(int) (num % 10)]++;
            num /= 10;
        }

        for (int i = 0; i < 10; i++) {
            if (count[i] > 1) {
                System.out.print(i + " ");
            }
        }

        sc.close();
    }
}


