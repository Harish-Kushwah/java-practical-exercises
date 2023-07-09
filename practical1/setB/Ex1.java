/** 
 a) Write a java program to display the system date and time in various formats shown 
below: 
Current date is  : 31/08/2021 
Current date is  : 08-31-2021 
Current date is  : Tuesday  August 31 2021 
Current date and time is  : Fri August  31 15:25:59 IST 2021 
Current date and time is  :  31/08/21 15:25:59 PM +0530 
Current time is  :   15:25:59 
Current week of year is : 35 
Current week of month : 5 
Current day of the year is : 243 
Note: Use java.util.Date and java.text.SimpleDateFormat class 
 */
package practical1.setB;

import java.util.Date;
import java.text.SimpleDateFormat;


/**
 * This is class to demonstrate the date time module
 * Formate the date 
 */
public class Ex1 {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat();

        formatter.applyPattern("dd/mm/yyyy ");
        String currentDate = formatter.format(date);
        System.out.println("Current date is  :" + currentDate);

        formatter.applyPattern("dd-mm-yyyy");
        currentDate = formatter.format(date);
        System.out.println("Current date is  :" + currentDate);

        formatter.applyPattern("E M dd yyyy");
        currentDate = formatter.format(date);
        System.out.println("Current date is :" + currentDate);

        formatter.applyPattern("E M  dd hh:mm:ss z yyyy");
        String currentDateTime = formatter.format(date);
        System.out.println("Current date and time :" + currentDateTime);

        formatter.applyPattern("dd/mm/yy kk:mm:ss a Z");
        currentDateTime = formatter.format(date);
        System.out.println("Current date and time :" + currentDateTime);

        formatter.applyPattern("kk:mm:ss");
        String currentTime = formatter.format(date);
        System.out.println("Current time is : " + currentTime);

        formatter.applyPattern("w");
        String weekOfYear = formatter.format(date);
        System.out.println("Current week of year : " + weekOfYear);

        formatter.applyPattern("W");
        String weekOfMonth = formatter.format(date);
        System.out.println("Current week of month : " + weekOfMonth);

        formatter.applyPattern("D");
        String dayOfYear = formatter.format(date);
        System.out.println("Current day of the : " + dayOfYear);

    }
}
