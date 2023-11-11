package practical4.setA;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.nio.Buffer;
import java.util.RandomAccess;

public class Ex1 {
    public static void main(String[] args) throws IOException {

        /*
         * String dirname = "C:/Users/haris/OneDrive/Desktop/TYBOOKS";
         * File f1 = new File(dirname);
         * 
         * if(f1.isDirectory())
         * {
         * String s[] = f1.list();
         * for(int i=0;i<s.length;i++)
         * {
         * File f = new File(dirname + "/" + s[i]);
         * if(f.isDirectory())
         * {
         * System.out.println(s[i] + " is s directory");
         * }
         * else{
         * System.out.println(s[i] + " is s file");
         * }
         * }
         * }
         * else{
         * System.out.println("Not found");
         * }
         */

        File f1 = new File("practical4/setA/Files/first.txt");
        File f3 = new File("practical4/setA/Files/first1.txt");
        // if(!f3.exists()){
        // f3.createNewFile();
        // }
        // if(f3.exists()){
        // f3.delete();
        // }

        // RandomAccessFile rand = new RandomAccessFile(f1, "rw");
        // rand.seek(f1.length());
        // rand.writeBytes("Append this line at the end");
        // rand.close();
        // System.out.println("Write successfully");

        System.out.println("Can file read :" + f1.canRead());
        System.out.println("is file exits :" + f1.exists());
        System.out.println("File name  :" + f1.getName());
        System.out.println("Length of file :" + f1.length());

        // String name = "Harish";
        // FileOutputStream fout = new FileOutputStream(f1, true);

        // char arr[] = name.toCharArray();
        // for (int i = 0; i < arr.length; i++) {
        // fout.write(arr[i]);
        // }
        // fout.close();

        // FileInputStream fin = new FileInputStream(f1);
        // int ch;
        // do {
        // ch = fin.read();
        // if (ch != -1)

        // System.out.print((char) ch);
        // } while (ch != -1);

        // FileWriter writer = new FileWriter(f3,true);
        // BufferedWriter bf = new BufferedWriter(writer);
        // bf.write(" Hellow world");
        // bf.close();

        FileReader reader = new FileReader(f3);
        BufferedReader br = new BufferedReader(reader);

        // int ch;
        // while ((ch = br.read()) != -1) {
        //     System.out.print((char) ch);
        // }


        // String str;
        // while((str = br.readLine())!=null){
        //     System.out.println(str);
        // }

        char[] b = new char[20];

        br.read(b, 10, 4);
        System.out.println(b);
        br.close();

        // InputStreamReader din = new InputStreamReader(System.in);
        // BufferedReader scan = new BufferedReader(din);
        // System.out.println("Enter number");
        // int n = Integer.parseInt(scan.readLine());
        // System.out.println(n);

    }
}