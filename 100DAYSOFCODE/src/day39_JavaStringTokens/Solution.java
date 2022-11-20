package day39_JavaStringTokens;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        if(!s.trim().isEmpty()){
            String str[] = s.trim().split("[, ?.@!,_']+");
            System.out.println(str.length);
            for(String st:str){
                System.out.println(st);
            }}
        else{
            System.out.println("0");
        }
        scan.close();
    }
}

