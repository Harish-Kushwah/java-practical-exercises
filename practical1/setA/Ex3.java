package practical1.setA;
import java.util.Scanner;

/*
 * c) Write a menu driven program to perform the following operations 
        i. Calculate the volume of cylinder. (hint : Volume: π × r² × h) 
        ii. Find the factorial of given number. 
        iii. Check the number is Armstrong or not. 
        iv. Exit
 */

class Cylinder {
    private final double PI = 3.14;
    private double radius, height;

    void input() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Radius of the Cylinder :");
        radius = scan.nextDouble();
        System.out.print("Enter Height of Cylinder :");
        height = scan.nextDouble();

    }

    void volume() {
        double volume = PI * radius * radius * height;
        System.out.println("Volume of Cylinder is : " + volume);
    }
}

class MathExample {

    int input() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number :");
        int num = scan.nextInt();
        return num;
    }

    void factorial(int num) {
        long pr = 1;
        for (int i = 2; i <= num; i++) {
            pr *= i;
        }
        System.out.println("Factorial of " + num + " is : " + pr);
    }

    int countDigit(int n) {
        int digit = 0;
        while (n > 0) {
            digit++;
            n /= 10;
        }
        return digit;
    }

    void isArmstrong(int num) {

        int temp = num;
        double total_digit = countDigit(num);
        double sum = 0d;

        while (num > 0) {
            int rem = num % 10;
            sum += Math.pow(rem, total_digit);
            num /= 10;
        }

        if (sum == temp) {
            System.out.println(temp + " Is armstrong number");
        } else {
            System.out.println(temp + " Is not armstrong number");
        }
    }
}

public class Ex3 {

    void menu() {
        System.out.println("1 : Calculate volume of Cylinder ");
        System.out.println("2 : Find factorial of given number ");
        System.out.println("3 : Check the number is armstrong or not");
        System.out.println("4 : Exit");
    }

    public void selectMenu() {
        menu();
        Scanner scan = new Scanner(System.in);

        int key = 0;
        while (key != 4) {
            System.out.print("Enter key :");
            key = scan.nextInt();

            switch (key) {
                case 1:
                    Cylinder cylinder = new Cylinder();
                    cylinder.input();
                    cylinder.volume();
                    break;

                case 2:
                    MathExample m1 = new MathExample();
                    m1.factorial(m1.input());
                    break;

                case 3:
                    MathExample m2 = new MathExample();
                    m2.isArmstrong(m2.input());
                    break;

                case 4:
                    System.out.println("Successfully exited..");
                    break;
            }

        }
    }

    public static void main(String[] args) {
        Ex3 ex = new Ex3();
        ex.selectMenu();
    }
}
