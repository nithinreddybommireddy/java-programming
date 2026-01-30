package com.java.programming.level4;

import java.util.Scanner;

public class SumOfFactorialOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = input.nextInt();
        int sum = 0;

        while (number > 0) {
            int s = number % 10;
            int factorial = 1;
            for (int j = 1; j <= s; j++) {
                factorial = factorial * j;
            }
            sum = sum + factorial;
            number = number / 10;
        }
        System.out.println("The Sum of Factorial of Digits :" + sum);
        input.close();
    }
}