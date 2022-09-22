package com.company;

import java.util.Scanner;

public class powerdemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int result = 1;

        System.out.println("Enter the base number");
        int base = sc.nextInt();

        System.out.println("Enter the power");
        int power = sc.nextInt();

        for (int i = 1; i<= power; i++){
            result *=base;
        }
        System.out.println("result: " + result);
    }
}
