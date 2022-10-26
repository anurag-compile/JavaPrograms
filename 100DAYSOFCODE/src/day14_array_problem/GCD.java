package day14_array_problem;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {

        //variables
        int size = 0;
        int [] arr = null;
        int result = 0;

        //create Scanner class object to read input
        Scanner in = new Scanner(System.in);

        //read size
        System.out.println("Enter total numbers: ");
        size = in.nextInt();

        //declare array
        arr = new int [size];

        //read numbers
        System.out.println("enter numbers: ");
        for (int i = 0; i < size; i++){
            arr[i] = in.nextInt();
        }

        //assign first number to result
        result = arr[0];

        // loop
        for (int i = 1; i < size; i++) {
            result = findHCF(result, arr[i]);
        }

        // display result
        System.out.println("GCD = " + result);

        //closer Scanner
        in.close();
    }

    //recursive method
    public static int findHCF(int num1, int num2){
        while (num1 != num2){
            if (num1 > num2)
                num1 = num1 - num2;
            else
                num2 = num2 - num1;
        }
        return  num1;
    }
}
