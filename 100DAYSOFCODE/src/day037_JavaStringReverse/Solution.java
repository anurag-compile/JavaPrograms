package day037_JavaStringReverse;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        StringBuilder B= new StringBuilder();

        for(int i=0; i<A.length(); i++)
        {
            B.insert(0, A.charAt(i));
        }

        System.out.println( (A.equals(B.toString())) ? "Yes" : "No" ) ;
    }
}

