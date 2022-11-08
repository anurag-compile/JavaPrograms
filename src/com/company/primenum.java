package com.company;

import java.util.Scanner;

public class primenum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        int n = sc.nextInt();
        int c = 0;
        for (int i = 1; i<=n; i++)
        {
            if (n % i == 0)
            {
                c++;
            }
        }
        if (c==2)
            System.out.println(n + " is PrimeNumber");
        else
            System.out.println(n + " is not PrimeNumber");
    }
}
