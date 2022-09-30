package day3;

import java.util.Scanner;

public class EOF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 1;
        while (in.hasNext())
        {
            n++;
            System.out.println(n+" "+in.nextLine());
        }
        in.close();

    }
}
