package com.company;

public class conditionals {

    public static void main(String[] args) {
        /*
            Sysntax of if Statements
            if (boolen expression T or F) {
                // body
            } else {
                // do this
            }
        */

       int salary = 5000;
      /*  if (salary > 10000){
            salary += 2000;
        } else {
            salary += 1000;
        }

       */
        // multiple if-else statement
        if (salary > 10000){
            salary += 2000; // salary = salary + 2000
        } else if (salary > 2000) {
            salary += 3000;
        } else {
            salary += 1000;
        }
        System.out.println(salary);
    }
}

