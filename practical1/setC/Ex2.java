package practical1.setC;
/*
 * b) Write a menu driven program to perform the following operations on 2D array: 
        i. Sum of diagonal elements 
        ii. Sum of upper diagonal elements 
        iii. Sum of lower diagonal elements 
        iv. Exit
 */

import java.util.Scanner;

class Matrix {
    int row, column;
    int[][] matrix;
    int diagonalSum = 0;
    int uppDiagonalSum = 0;
    int lowDiagonalSum = 0;

    void input() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter total number of rows : ");
        this.row = scan.nextInt();

        System.out.print("Enter total number of column :");
        this.column = scan.nextInt();

        this.matrix = new int[row][column];

        System.out.println("Enter a matrix :");

        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.column; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }
    }

    void calculateSum() {
        if (this.row == this.column) {

            for (int i = 0; i < this.row; i++) {
                for (int j = 0; j < this.column; j++) {
                    int element = matrix[i][j];
                    if (i == j) {
                        diagonalSum += element;
                    } else if (i < j) {
                        uppDiagonalSum += element;
                    } else {
                        lowDiagonalSum += element;
                    }
                }
            }
        } else {
            System.out.println("No diagonal exits ");
        }
    }

    void menu() {
        System.out.println("1.Enter for diagonal sum");
        System.out.println("2.Enter for upper diagonal sum");
        System.out.println("3.Enter for lower diagonal sum");
        System.out.println("4.Enter for Exit");
    }

    void performOperation() {
        menu();
        Scanner scan = new Scanner(System.in);
        int key = 0;

        this.calculateSum();

        while (key != 4) {
            System.out.print("Enter key :");
            key = scan.nextInt();

            switch (key) {
                case 1:
                    System.out.println("Diagonal element sum :" + this.diagonalSum);
                    break;

                case 2:
                    System.out.println("Upper diagonal element sum :" + this.uppDiagonalSum);
                    break;

                case 3:
                    System.out.println("Lower diagonal element sum :" + this.lowDiagonalSum);
                    break;

                case 4:
                    System.out.println("Successfully exited ..");
                    break;

            }
        }
    }
}

public class Ex2 {
    public static void main(String[] args) {
        Matrix m1 = new Matrix();
        m1.input();
        m1.performOperation();

    }
}
