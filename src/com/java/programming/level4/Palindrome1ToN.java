package com.java.programming.level4;

import java.util.Scanner;

public class Palindrome1ToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int temp = i;
            int temp1;
            temp1 = i;
            int reverse = 0;

            while (temp > 0) {
                int temp2 = temp % 10;
                reverse = reverse * 10 + temp2;
                temp = temp / 10;
            }
            if (reverse == temp1)
                System.out.println(" Palindrome 1 to N :"+temp1);

        }
        sc.close();
    }
}
