package practical2.setA;

import java.util.Arrays;

/*
 * c) Write a java program to accept 5 numbers using command line arguments sort and 
     display them
 */
public class Ex3 {
    public static void main(String[] args) {
        int arr[] = new int[5];
        for(int i=0;i<args.length; i++)
        {
            arr[i] = Integer.parseInt(args[i]);
        }
        Arrays.sort(arr);

        System.out.println("After sorting element :");
        for(int i =0;i<5;i++)
        {
            System.out.print(arr[i] + " ");
        }
        
    }
}
