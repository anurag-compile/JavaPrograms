import java.util.*;
import java.util.Queue;

public class QueueUsingArrList {
    public static void main(String[] args) 
        throws IllegalStateException
    {
         // creating object of Queue
        Queue<Integer> Q
                = new ArrayDeque<>();
        
        // Add numbers to end of Queue
        Q.add(65654564);
        Q.add(32546846);
        Q.add(58787468);
        Q.add(21321564);
        Q.add(54874511);
        
        //print the complete Queue
        System.out.println("Queue: " + Q);

        // print head and deletes the head
        System.out.println("Queue's head: " + Q.poll());

        // print head and deleted the head
        System.out.println("Queue's head: " + Q.poll());

        System.out.println("Queue: " + Q);

        System.out.println("Queue's head: " + Q.peek());
    }
}
