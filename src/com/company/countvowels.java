package com.company;

import java.util.Scanner;

public class countvowels {
    public static void main(String[] args) {
        int count = 0;
        System.out.println(" Enter a sentence : ");
        Scanner in = new Scanner(System.in);
        String sentence = in.next();

        for (int i=0; i<sentence.length(); i++){
            char ch = sentence.charAt(i);
            if(ch == 'a'||ch == 'e'||ch == 'i'||ch == 'o'||ch == 'u'||ch == ' '){
                count++;
            }
        }
        System.out.println("Number of vowels in the given sentence is " +count);
    }
}
