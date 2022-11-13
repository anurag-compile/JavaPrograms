package day033_JavaStaticInitializerBlock;
import java.io.*;
import java.util.*;
public class solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int b=sc.nextInt();
        int h=sc.nextInt();
        if(b<=0 || h<=0) System.out.print("java.lang.Exception: Breadth and height must be positive");
        else System.out.println(b*h);
    }
}
