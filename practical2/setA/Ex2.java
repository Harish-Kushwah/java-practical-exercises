package practical2.setA;

/*   Define Student class(roll_no, name, percentage) to create n objects of the 
    Student class. Accept details from the user for each object. Define a static 
    method sortStudent which sorts the array on the basis of  percentage.
 */
import java.util.Scanner;

class Student {
    private int roll_no;
    String name;
    float percentage;

    void input() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter name : ");
        this.name = scan.nextLine();

        System.out.print("Enter roll number :");
        this.roll_no = scan.nextInt();

        System.out.print("Enter percentage :");
        this.percentage = scan.nextFloat();
    }

    void showDetails() {
        System.out.println("Name of Student : " + this.name);
        System.out.println("Roll number : " + this.roll_no);
        System.out.println("Percentage :" + this.percentage);
    }

    public static void sortStudent(Student[] studentArray, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (studentArray[i].percentage > studentArray[j].percentage) {
                    Student temp = studentArray[i];
                    studentArray[i] = studentArray[j];
                    studentArray[j] = temp;
                }
            }
        }
    }
}

public class Ex2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter total student wants to add :");
        int n = scan.nextInt();
        Student[] studentArray = new Student[n];
        for (int i = 0; i < n; i++) {
            studentArray[i] = new Student();
            studentArray[i].input();
        }

        Student.sortStudent(studentArray, n);
        System.out.println("Student details after sorting on percentage :");
        for (int i = 0; i < n; i++) {
            studentArray[i].showDetails();
        }

    }
}
