package day1;

import java.util.*;
public class AddTwo {
    public static void main(String[] args) {
        int a,b,sum;
        System.out.println("Enter two numbers: ");
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        b = in.nextInt();

        sum = a+b;
        System.out.println("Addition: " + sum);
    }
}
