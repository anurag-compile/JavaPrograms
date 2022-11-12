package com.company;

class even implements Runnable {
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println(2 * i);
        }
    }
}

class odd implements Runnable {
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println(2 * i + 1);
        }
    }
}


class demo{
    public static void main(String[] args){
        even obj1 = new even();
        odd obj2 = new odd();
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();
    }
}