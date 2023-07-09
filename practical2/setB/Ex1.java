package practical2.setB;

import java.util.Scanner;
import practical2.sy.SYMarks;
import practical2.ty.TYMarks;
class Student {
    float sy_marks;
    float ty_marks;
    String name;
    int roll_no;
    float percentage;
    float grand_total;
    char grade;

    public void setTotalMarks()
    {  
        SYMarks sysub = new SYMarks();
        System.out.println("\n______Enter SY Marks _____\n");
        sysub.setSYMarks();
        this.sy_marks = sysub.getSYTotalMarks();


        System.out.println("\n______Enter TY Marks _____\n");
        TYMarks tysub = new TYMarks();
        tysub.setTYMarks();
        this.ty_marks = tysub.getTYTotalMarks();
    }

    public void setStudentInfo()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Your name :");
        this.name = scan.nextLine();

        System.out.print("Enter your roll number :");
        this.roll_no = scan.nextInt();
    }

    public void setOtherInfo()
    {
        this.grand_total = this.sy_marks + this.ty_marks;
        this.percentage = (this.grand_total/1200)*100;

        if(percentage>=70)
            this.grade = 'A';
        else if(percentage>=60)
            this.grade = 'B';
        else if(percentage>=50)
            this.grade = 'C';
        else if(percentage>=40)
            this.grade = 'P';
        else 
           this.grade = 'F';
    }

    public static void displayNStudentData( Student[] st,int n)
    {
      System.out.print("Roll no\tName\tSyTotal\tTyTotal\tGrandTotal\tPercentage\tGrade\n\n");
       for(int i = 0;i<n;i++)
       {
        st[i].displayStudentData();
       }
    }
    public void displayStudentData()
    {
       System.out.printf("%d\t %s\t   %.1f  \t%.1f" ,this.roll_no,this.name,this.sy_marks,this.ty_marks);
       System.out.printf(" \t%.1f \t%f \t%c\n",this.grand_total,this.percentage,this.grade);
    }

   
}
public class Ex1 {
     public static void main(String[] args)
    {
        
       Scanner scan  = new Scanner(System.in);
       System.out.println("Enter total number of student ");
       int total_std  = scan.nextInt();
       Student[] st = new Student[total_std];

       for(int i =0 ;i<total_std;i++)
       {
            st[i] = new Student();
            st[i].setStudentInfo();
            st[i].setTotalMarks();
            st[i].setOtherInfo();
       }
       Student.displayNStudentData(st, total_std);

    }
}
