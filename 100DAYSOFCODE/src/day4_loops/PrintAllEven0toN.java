package day4_loops;

import java.util.Scanner;

public class PrintAllEven0toN {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter No. of term ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        for (int i = 0; i <= n; i = i + 2)
        {
            System.out.println(i);
        }
    }
}
