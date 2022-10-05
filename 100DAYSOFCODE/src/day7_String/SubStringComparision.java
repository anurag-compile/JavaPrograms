package day7_String;
import java.util.Scanner;
public class SubStringComparision {
        public static String getSmallestAndLargest(String s, int k) {
            String smallest = s.substring(0, k);
            String largest = s.substring(0, k);

            for (int i = 0; i <= s.length() - k; i++) {
                String cuttedString = s.substring(i, k + i);

                if (cuttedString.compareTo(smallest) < 0)
                    smallest = cuttedString;

                if (cuttedString.compareTo(largest) > 0)
                    largest = cuttedString;
            }

            return smallest + "\n" + largest;
        }

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String s = scan.next();
            int k = scan.nextInt();
            scan.close();

            System.out.println(getSmallestAndLargest(s, k));
        }
    }

