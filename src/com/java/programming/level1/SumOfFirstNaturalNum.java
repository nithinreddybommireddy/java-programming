package com.java.programming.level1;

import java.util.Scanner;

public class SumOfFirstNaturalNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number:");
        int n = sc.nextInt();
        System.out.println("Sum of first N natural number upto :" + n);
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println(sum);

        sc.close();
    }

}
