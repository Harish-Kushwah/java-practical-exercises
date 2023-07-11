package practical4.setA;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.RandomAccess;

public class Ex1
{
    public static void main(String[] args) throws IOException {
        
        /* 
        String dirname = "C:/Users/haris/OneDrive/Desktop/TYBOOKS";
        File f1 = new File(dirname);

        if(f1.isDirectory())
        {
            String s[] = f1.list();
            for(int i=0;i<s.length;i++)
            {
                File f = new File(dirname + "/" + s[i]);
                if(f.isDirectory())
                {
                    System.out.println(s[i] + " is s directory");
                }
                else{
                    System.out.println(s[i] + " is s file");
                }
            }
        }
        else{
            System.out.println("Not found");
        }
        */

        File f1 = new File("Ex1.java");
        RandomAccessFile rand = new RandomAccessFile(f1, "rw");
        rand.seek(f1.length());
        rand.writeBytes("Append this line at the end");
        rand.close();
        System.out.println("Write successfully");

        
        
    }
}