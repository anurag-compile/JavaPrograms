package day2_ControlStatements;

import java.util.Scanner;

public class RemoveVowels {

    public static void main(String[] args)
    {
        System.out.println("enter a string: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e'
                    || s.charAt(i) == 'i' || s.charAt(i) == 'o'
                    || s.charAt(i) == 'u' || s.charAt(i) == 'A'
                    || s.charAt(i) == 'E' || s.charAt(i) == 'I'
                    || s.charAt(i) == 'O'
                    || s.charAt(i) == 'U') {
                continue;
            }
            System.out.print(s.charAt(i));
        }
    }
}