package com.company;

public class readline{
    public static void main(String[] args) {
        String string = "the cat is sleeping, but the dog is not sleeping";
        String word = "the";
        String temp[] = string.split(" ");
        int count = 0;
        for (int i = 0; i < temp.length; i++){
            if (word.equals(temp[i]))
                count++;
        }
        System.out.println("The String is: " + string);
        System.out.println("The word " + word + " occurs " + count + " times in the above string");
    }
}
