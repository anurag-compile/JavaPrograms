package day3;

import java.io.*;
import java.util.*;

public class DATATYPESHAKKERANK {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++){
            String result = "";
            if (scanner.hasNextByte())
                result += "\n* byte";
            if (scanner.hasNextShort())
                result += "\n* short";
            if (scanner.hasNextInt())
                result += "\n* int";
            if (scanner.hasNextLong())
                result += "\n* long";

            if (result.length() > 0)
                result = scanner.nextLine() + " can be fitted in:" + result;
            else
                result = scanner.nextLine() + " can't be fitted anywhere.";

            System.out.println(result);
        }


    }
}