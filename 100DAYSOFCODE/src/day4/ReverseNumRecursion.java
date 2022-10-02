package day4;

import java.util.Scanner;

public class ReverseNumRecursion {
//method for reverse number
    public static void reverseNumber(int num) {
        if (num < 10)
        {
            //prints the same number if the number is less than 10
            System.out.println(num);
            return;
        }
        else
        {
            System.out.println(num % 10);
            reverseNumber(num/10);
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter the number that you want to reverse: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.print("The reverse of the given number is: ");
        //method calling
        reverseNumber(num);
    }
}
