package practical3.setB;
/*
   a) Create an abstract class order having members id,description.Create two 
    subclasses Purchase Order and Sales Order having members customer name 
    and Vendor name respectively.Define methods accept and display in all cases. 
    Create 3 objects each of Purchase Order and Sales Order and accept and display 
    details
 */

import java.util.Scanner;

abstract class Order {
    int id;
    String description;
}

class PurchaseOrder extends Order {
    String customer_name;

    void acceptDetails() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter customer id :");
        this.id = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter Customer name :");
        this.customer_name = scan.nextLine();
        System.out.print("Enter description :");
        this.description = scan.nextLine();
    }

    void showDetails() {
        System.out.println("\nCustomer id :" + this.id);
        System.out.println("Customer name :" + this.customer_name);
        System.out.println("Description :" + this.description);
    }
}

class SalesOrder extends Order {
    String vendor_name;

    void acceptDetails() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter vendor id :");
        this.id = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter vendor name :");
        this.vendor_name = scan.nextLine();
        System.out.print("Enter description :");
        this.description = scan.nextLine();
    }

    void showDetails() {
        System.out.println("\nVendor id :" + this.id);
        System.out.println("Vendor name :" + this.vendor_name);
        System.out.println("Description :" + this.description);
    }

}

public class Ex1 {
    public static void main(String[] args) {

        PurchaseOrder p1 = new PurchaseOrder();
        PurchaseOrder p2 = new PurchaseOrder();
        PurchaseOrder p3 = new PurchaseOrder();
        System.out.println("Enter details for purchase order :");
        p1.acceptDetails();
        p2.acceptDetails();
        p3.acceptDetails();

        p1.showDetails();
        p2.showDetails();
        p3.showDetails();

        SalesOrder s1 = new SalesOrder();
        SalesOrder s2 = new SalesOrder();
        SalesOrder s3 = new SalesOrder();
        System.out.println("Enter details for sales order :");

        s1.acceptDetails();
        s2.acceptDetails();
        s3.acceptDetails();

        s1.showDetails();
        s2.showDetails();
        s3.showDetails();


    }
}
