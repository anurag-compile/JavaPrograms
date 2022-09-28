package com.company;
import java.util.*;

public class BasicCalculator{
    int add(int a, int b){
        int c = a+b;
        return c;
    }
    int sub(int a, int b){
        int c = a-b;
        return c;
    }
    int mul(int a, int b){
        int c = a*b;
        return c;
    }
    int div(int a, int b){
        int c = a/b;
        return c;
    }
}
class advcal extends BasicCalculator{
    int sqr(int a){
        a = a * a;
        return a;
    }
    int cube(int a){
        a = a*a*a;
        return a;
    }
    int fact(int a){
        int fact=1;
        for(int i = 1; i <= a; i++){
            fact*=1;
        }
        return fact;
    }
}
class scical extends advcal{
    double sqrt(Double a){
        a = Math.sqrt(a);
        return a;
    }
    double sin(double a){
        a = Math.sin(a);
        return a;
    }
    double cos(double a){
        a = Math.cos(a);
        return a;
    }
}
class calc{
    public static void main(String[] args) {
        scical s = new scical();
        System.out.println(s.add(3, 5));
        System.out.println(s.sub(5, 3));
        System.out.println(s.mul(6, 7));
        System.out.println(s.div(15, 3));
        System.out.println(s.sqr(7));
        System.out.println(s.cube(3));
        System.out.println(s.fact(4));
        System.out.println(s.sqrt(16.0));
        System.out.println(s.sin(3.14));
        System.out.println(s.cos(3.14));
    }
}