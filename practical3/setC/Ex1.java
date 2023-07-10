package practical3.setC;

/*
 * a) Create an interface Department containing attributes deptName and deptHead. It also 
has abstract methods for printing the attributes. Create a class hostel containing 
hostelName, hostelLocation and numberOfRooms. The class contains method printing 
the attributes. Then write Student class extending the Hostel class and implementing 
the Department interface. This class contains attributes studentName, regNo, 
electiveSubject and avgMarks. Write suitable printData method for this class. Also, 
implement the abstract methods of the Department interface. Write a driver class to 
test the Student class. The program should be menu driven containing the options: 
i. Admit new student 
ii. Migrate a student 
iii. Display details of a student 
 
For the third option, a search is to be made on the basis of the entered registration 
Number.
 */
import java.util.Scanner;

interface Department {
    public String deptName = "CS";
    public String deptHead = "HOD";

    public void showDeptDetails();

}

class Hostel {
    String hostelName;
    String hostelLocation;
    int numberOfRooms;

    public void showHostelDetails() {
        System.out.println("\n____________[Hostel Details]____________");
        System.out.println("Hostel name :" + this.hostelName);
        System.out.println("Hostel Location :" + this.hostelLocation);
        System.out.println("Number of rooms :" + this.numberOfRooms);
    }

    void setHostelDetails() {
        System.out.println("\n____________[Hostel Details]____________");

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Hostel name :");
        this.hostelName = scan.nextLine();
        System.out.print("Enter Hostel Location :");
        this.hostelLocation = scan.nextLine();
        System.out.print("Enter number of rooms :");
        this.numberOfRooms = scan.nextInt();

    }
}

class Student extends Hostel implements Department {
    String studentName;
    int regNo;
    String[] electiveSubject = new String[5];
    float avgMarks;

    public void setStudentDetails() {
        System.out.println("\n____________[Student Details]____________");

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter student name :");
        this.studentName = scan.nextLine();
        System.out.print("Enter registration number :");
        this.regNo = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter 5 elective subject :");
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter " + (i + 1) + " th subject name :");
            electiveSubject[i] = scan.nextLine();
        }

        System.out.print("Enter average makes :");
        this.avgMarks = scan.nextFloat();

    }

    public void showDeptDetails() {
        System.out.println("\n____________[Department Details]____________");
        System.out.println("Department name :" + Department.deptName);
        System.out.println("Department head :" + Department.deptHead);
    }

    public void showStudentDetails() {
        System.out.println("\n____________[Student Details]____________");
        System.out.println("Student name : " + this.studentName);
        System.out.print("Registration number :" + this.regNo);
        System.out.println("\nSubject opted :");
        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) + " th subject name :" + electiveSubject[i]);
        }
        System.out.println("\nAverage marks :" + this.avgMarks);

    }

}

public class Ex1 {

    void menu() {
        System.out.println("1.Admit new student");
        System.out.println("2.Migrate a student");
        System.out.println("3.Display details of student");
        System.out.println("4.Exit");

    }

    void performOperation() {
        menu();
        int key = 0;
        Scanner scan = new Scanner(System.in);
        Student st[] = new Student[10];
        int total_student = 0;
        while (key != 4) {
            System.out.print("Enter key :");
            key = scan.nextInt();

            switch (key) {
                case 1:
                    st[total_student] = new Student();
                    st[total_student].setStudentDetails();

                    st[total_student].setHostelDetails();
                    if (st[total_student] != null) {
                        System.out.println("Student added successfully..");
                    }
                    total_student++;
                    break;

                case 2:
                    break;

                case 3:
                    if (total_student != 0) {
                        System.out.println("Student details :");
                        for (int i = 0; i < total_student; i++) {
                            st[i].showDeptDetails();
                            st[i].showHostelDetails();
                            st[i].showStudentDetails();

                        }
                    } else {
                        System.out.println("Sorry,No Student record present..");
                    }

                    break;

                case 4:
                    System.out.println("Successfully exited...");
                    break;

            }

        }

    }

    public static void main(String[] args) {

        Ex1 ex = new Ex1();
        ex.performOperation();
    }
}
