package com.java.programming.level3;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstNum = sc.nextInt();

        System.out.print("Enter second number: ");
        int secondNum = sc.nextInt();

        while (secondNum != 0) {
            int temp = secondNum;
            secondNum = firstNum % secondNum;
            firstNum = temp;
        }

        System.out.println("GCD / HCF = " + firstNum);
        sc.close();
    }
}


