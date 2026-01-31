package com.java.programming.level5;

import java.util.Scanner;

public class MissingNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of N: ");
        int n = sc.nextInt();

        int[] arr = new int[n - 1];

        System.out.println("Enter " + (n - 1) + " elements:");
        int actualSum = 0;

        for (int i = 0; i < n - 1; i++) {
            arr[i] = sc.nextInt();
            actualSum += arr[i];
        }

        int expectedSum = n * (n + 1) / 2;
        int missingNumber = expectedSum - actualSum;

        System.out.println("Missing number is: " + missingNumber);

        sc.close();
    }
}

