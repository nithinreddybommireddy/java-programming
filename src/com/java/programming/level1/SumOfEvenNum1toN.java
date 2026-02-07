package com.java.programming.level1;

import java.util.Scanner;

public class SumOfEvenNum1toN
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number:");
        int n=sc.nextInt();
        System.out.println(" Sum of Even number upto :" +n);
         int evensum=0;
         for(int i=1;i<=n;i++)
         {
             if (i % 2 == 0)
             {
                 evensum = evensum + i;
                }

         }
        System.out.println(evensum);
       sc.close();
    }

}
