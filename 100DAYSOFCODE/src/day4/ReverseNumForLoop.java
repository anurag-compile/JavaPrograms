package day4;

public class ReverseNumForLoop {
    public static void main(String[] args) {
        int num = 123456, reverse = 0;
            for (;num !=0; num = num/10)
            {
                int remainder  = num % 10;
                reverse = reverse * 10 + remainder;
            }
            System.out.println("The reverse of the given num is: " + reverse);
    }
}
