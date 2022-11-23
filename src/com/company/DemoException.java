package com.company;
public class DemoException {
    public static void main(String[] args) {
        int j,k = 0;
        int[] a = new int[4];
        int i = 8;
        j=0;
        try
        {
            k=i/j;
            for (int c=0;c<=4;c++)
            {
                a[c]= c+1;
            }
        }
        catch (ArithmeticException e)
        {
            System.out.println("Cannot Divide By Zero");
        }
        System.out.println(k);
    }
}
