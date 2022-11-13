package day032_exceptionHandlingProblem;

import java.util.Scanner;
import java.util.regex.*;

public class solution
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        String VALID = "Valid";
        String INVALID = "Invalid";
        Pattern pat;
        while(testCases>0){
            String pattern = in.nextLine().trim();
            if(!pattern.isEmpty());{
                try{
                    pat = Pattern.compile(pattern);
                    System.out.println(VALID);
                }   catch(PatternSyntaxException e){
                    System.out.println(INVALID);
                }
            }
            testCases--;
        }
    }
}