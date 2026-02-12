package com.java.programming.level3;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        int firstNum = 0, secondNum = 1;

        System.out.print("Fibonacci Series: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(firstNum + " ");
            int result = firstNum + secondNum;
            firstNum = secondNum;
            secondNum= result;
        }
        sc.close();
    }
}


