package practical1.setB;
/*
 * c) Write a menu driven program to perform the following operations on 
        multidimensional array ie matrix : 
            i. Addition 
            ii. Multiplication 
            iii. Transpose of any matrix. 
            iv. Exit 
 */

import java.util.Scanner;

class Matrix {
    int matrix[][];
    private int row;
    private int column;

    Matrix() {
    }

    Matrix(int row, int column) {
        this.row = row;
        this.column = column;
        this.matrix = new int[row][column];
    }

    void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    int getTotalRow() {
        return this.row;
    }

    int getTotalCol() {
        return this.column;
    }

    void input() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter total number of row :");
        this.row = scan.nextInt();

        System.out.print("Enter total number of columns :");
        this.column = scan.nextInt();
        this.matrix = new int[row][column];
        System.out.println("Enter matrix :");

        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.column; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }

    }

    void printMatrix() {
        System.out.println("Matrix  is :");

        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.column; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    int[][] getMatrix() {
        return this.matrix;
    }
}

class MatrixOperation {

    void add() {
        Matrix m1 = new Matrix();
        Matrix m2 = new Matrix();
        m1.input();
        m2.input();
        int[][] mat1 = m1.getMatrix();
        int[][] mat2 = m2.getMatrix();

        if (m1.getTotalRow() == m2.getTotalRow() && m1.getTotalCol() == m2.getTotalCol()) {
            Matrix m3 = new Matrix(m1.getTotalRow(), m1.getTotalCol());
            int[][] mat3 = m3.getMatrix();

            for (int i = 0; i < m1.getTotalRow(); i++) {
                for (int j = 0; j < m1.getTotalCol(); j++) {
                    mat3[i][j] = mat1[i][j] + mat2[i][j];
                }
            }
            m3.setMatrix(mat3);
            m3.printMatrix();
        }

    }

    void multiplication() {
        Matrix m1 = new Matrix();
        Matrix m2 = new Matrix();
        m1.input();
        m2.input();
        if (m1.getTotalCol() == m2.getTotalRow()) {
            Matrix m3 = new Matrix(m1.getTotalRow(), m2.getTotalCol());
            int[][] result = m3.getMatrix();

            int[][] mat1 = m1.getMatrix();
            int[][] mat2 = m2.getMatrix();

            for (int i = 0; i < m1.getTotalRow(); i++) {
                for (int j = 0; j < m2.getTotalCol(); j++) {
                    for (int k = 0; k < m2.getTotalRow(); k++) {
                        result[i][j] += mat1[i][k] * mat2[k][j];
                    }
                }
            }

            m3.setMatrix(result);
            m3.printMatrix();
        } else {
            System.out.println("Matrix multiplication is not possible");
        }
    }

    void transpose() {
        Matrix m1 = new Matrix();

        m1.input();
        int[][] matrix = m1.getMatrix();
        Matrix m2 = new Matrix(m1.getTotalCol(), m1.getTotalRow());
        int[][] result = m2.getMatrix();
        for (int i = 0; i < m1.getTotalCol(); i++) {
            for (int j = 0; j < m1.getTotalRow(); j++) {
                result[i][j] = matrix[j][i];
            }
        }

        m2.setMatrix(result);
        m2.printMatrix();
    }

    void menu() {
        System.out.println("1.Enter for Addition ");
        System.out.println("2.Enter for Multiplication");
        System.out.println("3.Enter for Transpose");
        System.out.println("4.Enter for Exit");
    }

    void performOperation() {
        menu();
        Scanner scan = new Scanner(System.in);

        int key = 0;
        while (key != 4) {
            System.out.println("Enter key :");
            key = scan.nextInt();
            switch (key) {
                case 1:
                    this.add();
                    break;
                case 2:
                    this.multiplication();
                    break;
                case 3:
                    this.transpose();
                    break;
                case 4:
                    System.out.println("Exited successfully..");
                    break;
            }
        }
    }
}

public class Ex3 {

    public static void main(String[] args) {
        MatrixOperation op = new MatrixOperation();
        op.performOperation();
    }
}
