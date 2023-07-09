package practical2.setA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * d)  Write a java program that take input as a person name in the format of first, middle 
    and  last  name  and  then print  it  in the  form last,  first  and  middle  name,  where  in  the 
    middle name first character is capital letter
 */
public class Ex4 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter first name :");
        String first_name = br.readLine();
        System.out.print("Enter middle name :");
       String middle_name = br.readLine();
        System.out.print("Enter last name :");
        String last_name= br.readLine();

        StringBuffer sb = new StringBuffer(middle_name);
        middle_name = (sb.substring(0, 1).toUpperCase() + sb.substring(1)).toString();
        System.out.println(last_name + " " + first_name + " " + middle_name);

        

    }
}
