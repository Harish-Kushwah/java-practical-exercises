package practical1.setA;

import java.util.Scanner;

/*
 * d) Write a program to accept the array element and display in reverse order.
 */
public class Ex4 {

    int[] arr;
    int size;

    void input() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size :");
        size = scan.nextInt();
        System.out.printf("Enter the %d array element :", size);

        arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }
        scan.close();
    }

    void reverseArray() {
        for (int i = 0; i <size / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[size - (i + 1)];
            arr[size - (i + 1)] = temp;
        }

    }

    void printArray() {
        System.out.print("After reversing thr array element :");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

        Ex4 ex = new Ex4();
        ex.input();
        ex.reverseArray();
        ex.printArray();
    }
}
