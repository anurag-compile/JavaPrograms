package com.company;

import java.util.Scanner;

public class GreatestNum {
    public static void main(String[] args) {
        int num1,num2,greatest;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first Number: ");
        num1 = in.nextInt();
        System.out.println("Enter the second Number: ");
        num2 = in.nextInt();

        if (num1>num2)
            greatest = num1;
        else
            greatest = num2;

        System.out.println("\ngreatest = " +greatest);
    }
}
