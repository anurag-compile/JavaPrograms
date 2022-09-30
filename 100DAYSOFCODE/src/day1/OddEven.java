package day1;

import java.util.Scanner;
class OddEven
{
    public static void main(String[] args) {
        int n;
        System.out.println("Enter any number ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        if (n%2==0)
        {
            System.out.println("Even Number");
        }
        else
        {
            System.out.println("Odd Number");
        }
    }
}