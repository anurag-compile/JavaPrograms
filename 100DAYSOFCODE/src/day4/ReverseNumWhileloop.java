package day4;

public class ReverseNumWhileloop {
    public static void main(String[] args) {
        int num = 123456, reverse = 0;
        while (num!=0)
        {
            int remainder = num%10;
            reverse = reverse * 10 + remainder;
            num = num/10;
        }
        System.out.println("The Reverse of The Given Number is:" + reverse);
    }
}
