package day038_JavaAnagrams;
import java.util.Scanner;

public class anagrams {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        if(a.length()!=b.length()){
            return false;
        }

        else{
            char[] charArray_A = (a.toLowerCase()).toCharArray();
            char[] charArray_B = (b.toLowerCase()).toCharArray();

            java.util.Arrays.sort(charArray_A);
            java.util.Arrays.sort(charArray_B);

            return java.util.Arrays.equals(charArray_A,charArray_B);
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}