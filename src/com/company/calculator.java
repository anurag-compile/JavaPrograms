package com.company;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // take the input from user till user does not press X or x.
        int ans= 0;
        while (true) {
            //take the operator as input
            System.out.print("Enter any operator: ");
            char op = in.next().trim().charAt(0);
            System.out.println();
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
                //input two numbers
                System.out.print("Enter two number: ");
                int num1= in.nextInt();
                int num2= in.nextInt();
                System.out.println();

                if (op == '+'){
                    ans = num1 + num2;
                }
                if (op == '-'){
                    ans = num1 - num2;
                }
                if (op == '*'){
                    ans = num1 * num2;
                }
                if (op == '/'){
                    ans = num1 / num2;
                }
                if (op == '%'){
                    ans = num1 % num2;
                }
            } else if (op == 'x' || op == 'X'){
                break;
            }else {
                System.out.println("invalid operation");
            }
            System.out.println(ans);
        }
    }
}
