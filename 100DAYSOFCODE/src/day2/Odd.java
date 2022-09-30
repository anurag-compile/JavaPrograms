package day2;
import java.util.*;
class Odd
{
    public static void main(String[] args) {
        int n;
        System.out.println("Enter no. of term: ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        for (int i = 1; i <= n; i=i+2)
        {
            System.out.print(i);
        }
    }
}