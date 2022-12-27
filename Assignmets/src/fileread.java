import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class fileread {
    public static void main(String[] args)
            throws IOException {

            FileReader r = new FileReader("C:\\Users\\Anurag Dutt\\Desktop\\filewrite.txt");

            int i;
            while ((i = r.read())!=-1) {
                System.out.println((char) i);
            }
            r.close();
        }
    }