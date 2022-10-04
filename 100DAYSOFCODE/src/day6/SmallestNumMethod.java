//find the smallest number among three numbers.
package day6;

import java.util.Scanner;

public class SmallestNumMethod {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the First Number: ");
        double x = in.nextDouble();
        System.out.print("Input the Second Number: ");
        double y = in.nextDouble();
        System.out.print("Input the Third Number: ");
        double z = in.nextDouble();
        System.out.print("The Smallest value is " + smallest(x, y, z)+"\n" );

    }
    public static double smallest(double x, double y, double z)
    {
        return Math.min(Math.min(x,y), z);
    }
}
