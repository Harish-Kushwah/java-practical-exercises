package practical1.setA;
/*
 * Write a program to calculate perimeter and area of rectangle. 
(hint : area = length * breadth , perimeter=2*(length+breadth))
 */

import java.util.Scanner;

class Rectangle {
    float length;
    float breadth;

    public void input() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter length :");
        length = scan.nextFloat();
        System.out.print("Enter breadth :");
        breadth = scan.nextFloat();
        scan.close();

    }

    public void perimeter() {
        float perimeter = 2 * (length + breadth);
        System.out.println("Perimeter of Rectangle is : " + perimeter);
    }

    public void area() {
        float area = length * breadth;
        System.out.println("Area of rectangle is : " + area);
    }
}

public class Ex2 {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        rectangle.input();
        rectangle.perimeter();
        rectangle.area();

    }
}
