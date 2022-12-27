import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class copyfile {
    public static void main(String[] args)
    throws IOException {
        FileInputStream r = new FileInputStream("C:\\Users\\Anurag Dutt\\Desktop\\filewrite.txt");
        FileOutputStream j = new FileOutputStream("C:\\Users\\Anurag Dutt\\Desktop\\fileread.txt");

        int i;
        while ((i=r.read())!=-1)
        {
            j.write((char)i);
        }
        System.out.println("Data Copied...");
    }
}
