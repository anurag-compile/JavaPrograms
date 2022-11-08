package day27_Packages; // used package here

public class packages {
    public static void main(String[] args) {
        String str = "anuragdutt", nstr="";
        char ch;

        System.out.println("Original Word: ");
        System.out.println("anuragdutt");

        for (int i=0; i<str.length(); i++)
        {
            ch = str.charAt(i);
            nstr = ch+nstr;
        }
        System.out.println("Reversed Word: " + nstr);
    }
}
