import java.util.*;
public class Main {
    public static void main(String[] args) {
        int speedlimit = 70;
        int kmPoint = 5;
        System.out.print("Enter Speed : ");
        Scanner sc = new Scanner(System.in);
        int speed = sc.nextInt();

        if (speed < speedlimit + kmPoint){
            System.out.println("ok");
        }
        else {
            int points = (speed-speedlimit)/kmPoint;
            if (points >= 12)
                System.out.println("License Suspended ! ");
            else
                System.out.println("points: "+ points);
        }
    }
}
