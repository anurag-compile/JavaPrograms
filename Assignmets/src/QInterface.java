
import java.util.*;
import java.util.Queue;

public class QInterface {
    public static void main(String[] args)
            throws IllegalStateException
    {

        // create object of Queue
        Queue<Integer> Q
                = new LinkedList<>();

        if (Q.offer(10))
            System.out.println("The Queue is not full"
                    + " and 10 is inserted");
        else
            System.out.println("The Queue is full");

        if (Q.offer(15))
            System.out.println("The Queue is not full"
                    + " and 15 is inserted");
        else
            System.out.println("The Queue is full");

        if (Q.offer(20))
            System.out.println("The Queue is not full"
                    + " and 20 is inserted");
        else
            System.out.println("The Queue is full");

        if (Q.offer(25))
            System.out.println("The Queue is not full"
                    + " and 25 is inserted");
        else
            System.out.println("The Queue is full");

        if (Q.offer(30))
            System.out.println("The Queue is not full"
                    + " and 30 is inserted");
        else
            System.out.println("The Queue is full");

        if (Q.offer(35))
            System.out.println("The Queue is not full"
                    + " and 35 is inserted");
        else
            System.out.println("The Queue is full");



        // before removing print Queue
        System.out.println("Queue: " + Q);

        // print head and deletes the head
        System.out.println("Queue's head: " + Q.poll());

        // print head and deleted the head
        System.out.println("Queue's head: " + Q.poll());

        // after removing print Queue
        System.out.println("Queue: " + Q);

        System.out.println("Peek element of Queue : " + Q.peek());
    }
}
