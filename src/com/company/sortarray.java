package com.company;

import java.util.Arrays;

public class sortarray {
    public static void main(String[] args) {
        String[] strArr = new String[] { "r", "p", "v", "y", "s", "q" };
        System.out.println("Sort Array in Alphabetical Order...");
        Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER);
        for (int a = 0; a < strArr.length; a++){
            System.out.println(strArr[a]);
        }
    }
}
