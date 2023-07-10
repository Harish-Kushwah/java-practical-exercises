package practical3.setA;

import java.util.Scanner;

/* 
    b)  Define an abstract class Staff with protected members id and name. Define a 
    parameterized constructor. Define one subclass OfficeStaff with member 
    department. Create n objects of OfficeStaff and display all details. 
*/
abstract class Staff {
    protected int id;
    protected String name;

    Staff(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class OfficeStaff extends Staff {
    String department;

    OfficeStaff(int id, String name, String department) {
        super(id, name);
        this.department = department;
    }

    void displayDetails() {
        System.out.println("ID : " + this.id);
        System.out.println("Name : " + this.name);
        System.out.println("Department :" + this.department);

    }
}

public class Ex2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter how many Office Staff wants to add :");
        int n = scan.nextInt();
        OfficeStaff[] arrStaff = new OfficeStaff[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter Details of " + (i + 1) + " Staff member :");
            System.out.print("Enter id :");
            int id = scan.nextInt();
            scan.nextLine();
            System.out.print("Enter name :");
            String name = scan.nextLine();
            System.out.print("Enter department :");
            String department = scan.nextLine();

            arrStaff[i] = new OfficeStaff(id, name, department);
        }
        for (int i = 0; i < n; i++) {
            System.out.println("\nDetails of " + (i + 1) + "Staff member :");
            arrStaff[i].displayDetails();
        }

        scan.close();
    }
}
