package practical1.setC;
/*
 * c) Write a program to display the 1 to 15 tables.  
        ( 1 * 1 = 1 2 * 1 = 2 .........15 * 1 = 15 
          1 * 2 = 2 2 * 2 = 4 .........15 * 2 = 30 
          1 * 3 = 3 2 * 3 = 6 ........ 15 * 3 = 45 
          1 * 10 = 10 2 * 10 = 20 .....15 * 10 = 150)
 */
public class Ex3 {
    public static void main(String[] args) {
        int n  = 15;
        for(int i =1;i<=10;i++)
        {
            for(int j=1;j<=n;j++)
            {
                System.out.print(j + " * " + i+ " = " +(i*j) + "   ");
            }
            System.out.println();
        }
    }
}
