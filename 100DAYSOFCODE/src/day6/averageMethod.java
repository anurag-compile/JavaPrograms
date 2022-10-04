package day6;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class averageMethod {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input The First Number: ");
        double x = in.nextDouble();
        System.out.print("Input the Second Number: ");
        double y = in.nextDouble();
        System.out.print("Input the Third Number: ");
        double z = in.nextDouble();
        System.out.print("The Average value is " + average(z, y, z)+"\n");

    }
    public static double average(double x, double y, double z)
    {
        return (x + y + z) / 3;
    }
}
