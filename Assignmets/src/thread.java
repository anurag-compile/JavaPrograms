public class thread {

    public static void main(String[] args) {
        Runnable r = new Runnable1();
        Thread t = new Thread(r);
        Runnable r2 = new Runnable2();
        Thread t2 = new Thread(r2);
        t.start();
        t2.start();
    }
}

class Runnable2 implements Runnable{
    public void run(){
        for(int i=1;i<100;i++) {
            System.out.println("Divide by both 7 and 11");
            if (i%7==0 && i%11==0)
                System.out.println(i);
        }
    }
}

class Runnable1 implements Runnable{
    public void run(){
        System.out.println("Divide by either 5 or 13");
        for(int i=1;i<100; i++) {
            if ( i%5==0 || i%13==0 )
                System.out.println(i);
        }
    }
}