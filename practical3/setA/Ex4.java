package practical3.setA;
/*
 * c) Write a program to find the cube of given number using function interface
 */

import java.util.Scanner;

interface Math {
    public int cube(int num);
}

class MathOperations implements Math {
    public int cube(int num) {
        return num * num * num;
    }
}

public class Ex4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        MathOperations m1 = new MathOperations();
        System.out.print("Enter number :");
        int num = scan.nextInt();
        System.out.println("Cube of " + num + " is :" + m1.cube(num));

    }
}
