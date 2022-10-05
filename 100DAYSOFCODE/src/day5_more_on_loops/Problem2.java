package day5_more_on_loops;

public class Problem2 {
    public static void main(String[] args) {
        int sum = 0;
        int n = 5;
        for (int i=0;i<n;i++){
            sum = sum + (2*i);
        }
        System.out.print("Sum of even numbers is: ");
        System.out.println(sum);

    }
}