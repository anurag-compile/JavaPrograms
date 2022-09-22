package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class loops {

    public static void main(String[] args) {
        /*
                Syntax of for loops:

                for (initialisation; conditions; increment/decrement) {
                // body
                }
         */

        /* Q: Print numbers from 1 to 20
        for (int num=1; num<=20; num++ ) {
            System.out.println(num);
        }*/
// print numbers from 1 to n
        Scanner in = new Scanner(System.in);
        //int n = in.nextInt();

        //    for (int num = 1; num <= n; num++){
        //          System.out.println(num + " ");
        //          System.out.println("Hello World");
        // }

        // while loops
        // Syntax :
        // while (condition) {
        //     //body
        // }

        /*int num = 1;
        while (num <= 5) {
            System.out.println(num);
            num += 1;
        }*/

        //do while
        /*

        do{
            //body
        } while (condition);
         */

        int n = 1;
        do {
            System.out.println(n);
            n++;
        } while ( n <= 5);
    }
}
