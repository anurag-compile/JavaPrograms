
import java.util.*; import java.sql.Timestamp;

class Q5{  public static void main(String args[]){
    Queue Q = new Queue();
    Producer P = new Producer(Q);
    Consumer C = new Consumer(Q);
}
}
class Queue {  	int rear = -1,front=0,max=10,count=0;
    String arr[] = new String[max];
    void add() throws InterruptedException{
        synchronized(Queue.this){
            while(count == max)
            {
                System.out.println("Queue is full. Please wait...");
                Queue.this.wait();
            }
            Date date= new Date();   	 	long time = date.getTime();
            Timestamp tss = new Timestamp(time);
            String ts = tss.toString();  	 	Thread.sleep(500);
            try{  	 	 	 	 	// x += 10;
                rear = (rear+1)%max;  	 	 	        arr[rear] = ts;  	 	 	        count++;
                System.out.println("Value Inserted by Producer");
                Queue.this.notify();
            }catch (ArrayIndexOutOfBoundsException e){

            }
        }
    }
    void remove() throws InterruptedException{
        synchronized(Queue.this){
            while(count == 0)
            {
                System.out.println("Queue is empty. Please wait...");
                Queue.this.wait();
            }
            Thread.sleep(500);
            try{
                String z = arr[front];
                System.out.println("Removing " + z); 	 	 	   	 	 	        front = (front + 1) % max;
                count--;
                System.out.println("Value Deleted by Consumer");
                Queue.this.notify();
            }catch (ArrayIndexOutOfBoundsException e){
            }
        }
    }
}
class Producer implements Runnable{
    Queue q;  	Thread t;  	int count=0;  	public Producer(Queue i){
        this.q = i;
        t = new Thread(this);
        t.start();
    }
    @Override  	public void run(){ 	 	  	 	while (count < 100)
    {
        try{
            q.add();
        }
        catch (InterruptedException ex){
            ex.printStackTrace();
        }
        count++;
    }
    }
}
class Consumer implements Runnable{
    Queue q; Thread t; int count =0;
    public Consumer(Queue i){
        this.q = i;  	t = new Thread(this);
        t.start();
    }
    @Override  	public void run(){ 	 	  	 	while (count < 100)
    {
        try{
            q.remove();
        }
        catch (InterruptedException ex){
            ex.printStackTrace();
        }
        count++;
    }
    }
}
