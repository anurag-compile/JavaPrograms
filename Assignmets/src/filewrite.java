import java.io.*;

public class filewrite {
    public static void main(String[] args) {
        try
        {
            FileWriter f = new FileWriter("C:\\Users\\Anurag Dutt\\Desktop\\filewrite.txt");
            try
            {
                f.write("Java Programming is worst programming language");
            }
            finally {
                f.close();
            }
            System.out.println("Succesfully Data written in file");
        }
        catch (IOException i)
        {
            System.out.println(i);
        }
    }
}
