package day3_Ifelse;

import java.util.Scanner;

public class salBonus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the current Salary: ");
        int sal = in.nextInt();
        System.out.println("Enter year of service: ");
        int year = in.nextInt();
        if (year > 5)
        {
            System.out.println("Monthly Salary is " +sal+ ". You will get the bonus of  " + (sal * 0.05)+ " Rupees");
        }
        else
            System.out.println("Your Service is less then 5 years: Sorry you are not eligible for bonus :/" );
    }
}
