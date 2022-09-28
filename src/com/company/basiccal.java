package com.company;
import java.util.Scanner;
public class basiccal {


    public static class Calculator {
        public static void main(String[] args) {
            String s1 = getInput("Enter the 1st number: ");
            String s2 = getInput("Enter the 2nd number: ");
            String operator = getInput("Please choose between + - * and /: ");

            double result = 0;

            try {
                switch (operator) {
                    case "+":
                        result = addition(s1, s2);
                        break;
                    case "-":
                        result = subtraction(s1, s2);
                        break;
                    case "*":
                        result = multyplyng(s1, s2);
                        break;
                    case "/":
                        result = division(s1, s2);
                        break;
                    default:
                        System.out.println("There is NO such operation! Please choose between the 4!");
                        break;
                }
                System.out.println("The result is: " + result);
            } catch (Exception e) {
                System.out.println("Number formatting exception " + e.getMessage());
            }
        }

        static String getInput(String prompt) {//METHOD FOR GETTING THE INPUT FROM THE USER: getInput (WITH String ARGUMENT prompt)
            System.out.print(prompt);
            Scanner console = new Scanner(System.in);
            return console.nextLine();
        }

        static double addition(String st1, String st2) {//METHOD FOR ADDITION: addition (WITH 2 String ARGUMENTS st1 AND st2)
            double d1 = Double.parseDouble(st1);
            double d2 = Double.parseDouble(st2);
            return d1 + d2;
        }

        static double subtraction(String st1, String st2) {//METHOD FOR SUBTRACTION: subtraction (WITH 2 String ARGUMENTS st1 AND st2)
            double d1 = Double.parseDouble(st1);
            double d2 = Double.parseDouble(st2);
            return d1 - d2;
        }

        static double multyplyng(String st1, String st2) {//METHOD FOR MULTYPLYNG: multyplyng (WITH 2 String ARGUMENTS st1 AND st2)
            double d1 = Double.parseDouble(st1);
            double d2 = Double.parseDouble(st2);
            return d1 * d2;
        }

        static double division(String st1, String st2) {//METHOD FOR DIVISION: division (WITH 2 String ARGUMENTS st1 AND st2)
            double d1 = Double.parseDouble(st1);
            double d2 = Double.parseDouble(st2);
            return d1 / d2;
        }
    }
}
