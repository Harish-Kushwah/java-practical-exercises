package practical1.setC;
/*
 * a) Write  a  program  to  accept  n  names  of  country  and  display  them  in  descending order.
 */

import java.util.Scanner;

class Country {
    String name;
    Country[] list;
    int n;

    Country() {
    }

    Country(String name) {
        this.name = name;
    }

    void inputCountries() {
        Scanner scan = new Scanner(System.in);
        Scanner scan_str = new Scanner(System.in);
        System.out.println("Enter total number of country");
        this.n = scan.nextInt();
        this.list = new Country[n];
        System.out.println("Enter country names :");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter " + (i + 1) + " th country :");
            String name = scan_str.nextLine();
            list[i] = new Country(name);
        }
    }

    void sortCountryName() {
        for (int i = 0; i < this.n; i++) {
            for (int j = i + 1; j < this.n; j++) {
                if (list[i].name.compareTo(list[j].name) < 0) {
                    String temp = list[i].name;
                    list[i].name = list[j].name;
                    list[j].name = temp;
                }
            }
        }
    }

    void printCountryNames() {
        System.out.println("After sorting in descending order :");
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + " th country :");
            System.out.println(list[i].name);

        }
    }

}

public class Ex1 {

    public static void main(String[] args) {

        Country country_list = new Country();
        country_list.inputCountries();
        country_list.sortCountryName();
        country_list.printCountryNames();

    }
}
