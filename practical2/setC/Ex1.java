package practical2.setC;
import java.util.Scanner;

/*
 * a) Write a package for String operation which has two classes Con and Comp. Con class 
    has to concatenates two strings and comp class compares two strings. Also display 
    proper message on execution
 */
import practical2.stringoperation.*;
public class Ex1 {

    void concatStrings()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter string :");
        String str1 = scan.nextLine();
        System.out.print("Enter another string for concat :");
        String str2 = scan.nextLine();

        Concat c1 = new Concat();
        String str3 = c1.con(str1,str2);
        System.out.println("String after concatinating both string :" + str3);
    }

    void compareStrings()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter string :");
        String str1 = scan.nextLine();
        System.out.print("Enter another string for compare :");
        String str2 = scan.nextLine();

        Compare cmp_obj = new Compare();
        if(cmp_obj.cmp(str1,str2))
        {
            System.out.println("Both strings are equal");
        }
        else{
            System.out.println("Both strings are not equal");
        }
    }
    public static void main(String[] args) {
        
        Ex1 ex = new Ex1();
        ex.concatStrings();
        ex.compareStrings();

    }
}
