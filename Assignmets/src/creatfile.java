import java.io.*;

public class creatfile {
    public static void main(String[] args)
            throws IOException {
        File f = new File("C:\\Users\\Anurag Dutt\\Desktop\\newfile.txt");
        if (f.exists())
        {
            System.out.println("File name: " + f.getName());
            System.out.println("File Location: "+ f.getAbsolutePath());
            System.out.println("File Writable: "+ f.canWrite());
            System.out.println("File Readable: "+ f.canRead());
            System.out.println("File size: "+ f.length());
            System.out.println("File Removed: "+ f.delete());
        }
        else {
            System.out.println("File does not Exist");
        }
    }
}