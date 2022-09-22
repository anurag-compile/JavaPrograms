package com.company;
import java.util.*;
public class factorialdemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fact = 1; //to hold factorial

        System.out.print("Enter any positive integer: ");
        int num = sc.nextInt();

        for (int i = 1; i<=num; i++ ){
            fact *= i;
        }

        System.out.println("Factorial: " + fact);
    }
}
