package com.java.programming.level2;

import java.util.Scanner;

public class AllPrime1toN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        for (int i = 2; i <= n; i++) {
            boolean Prime = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j== 0) {
                    Prime = false;
                    break;
                }
            }
            if (Prime) {
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}
