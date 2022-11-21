import java.util.Scanner;
public class CountVowelAndConsonant{
    public static void main(String[] args){
        String str;
        int vowCount=0,consCount=0;

        Scanner scan=new Scanner(System.in);
        //create a scanner object for input

        System.out.println("Enter the String for count vowel and consonant  ");
        str=scan.nextLine();
        int i;
        for(i=0; i<str.length(); i++){
            char ch=str.charAt(i);
//check whether a character is a vowel
            if(ch == 'a'|| ch == 'e'|| ch == 'i'|| ch == 'o'|| ch == 'u'
                    ||ch == 'A'|| ch == 'E'|| ch == 'I'|| ch == 'O'|| ch == 'U' ){
                vowCount++;//increments the vowel counter
            }
//check whether a character is a consonant
            else if((ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z' )){
                consCount++;//increments the consonant counter
            }
        }
        System.out.println("Number of vowels: "+vowCount);//display vowels
        System.out.println("Number of consonants: "+consCount);//display consonant
    }
}
