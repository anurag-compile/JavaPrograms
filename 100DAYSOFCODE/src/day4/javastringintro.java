package day4;

import java.io.*;
import java.util.*;

public class javastringintro {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length() + B.length());
        System.out.println(A.compareTo(B) > 0 ? "Yes" : "No");
        System.out.println(capitalize(A) + " " + capitalize(B));
    }

    private static String capitalize(String word) {
        return word.substring(0, 1).toUpperCase() + word.substring(1, word.length());
    }
}