package com.company;

import java.util.Scanner;
class  lowToUpperCase

{
    public static void main(String arg[])
    {
        int i;
        char c[];
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the string: ");
        String s1=sc.nextLine();

        char[] ch = s1.toCharArray();
        System.out.print("Uppercase("+s1+")--------->");
        for(i=0;i<s1.length();i++)
        {

            if(ch[i]>=97 && ch[i]<=122 )
            {
                ch[i]-=32;
            }

        }

        System.out.println(ch);

    }
}