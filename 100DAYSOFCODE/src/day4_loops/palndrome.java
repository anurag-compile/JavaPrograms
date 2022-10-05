package day4_loops;
import java.util.*;

public class palndrome {
    public static void main(String[] args)
    {
        int arr[] = new int[3];
        Scanner in = new Scanner(System.in);

        for(int i=0; i<=2; i++)
        {
            System.out.print("enter value for element " + i + " = ");
            arr[i] = in.nextInt();
            System.out.println();
        }

        for(int i=0; i<=2; i++) {
            System.out.print("[" + arr[i] + "] ");
        }
     /*
        int i=0;
        while(i<10)
        {
            i++;
        }

        int j=0;
        do{

            j++;
        }while(j<10);
       */

    }
}
