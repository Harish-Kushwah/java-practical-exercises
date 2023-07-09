package practical2.setB;
/*
 * b) Define a class CricketPlayer (name,no_of_innings,no_of_times_notout, totatruns, 
   bat_avg). Create an array of n player objects .Calculate the batting average for each 
   player using static method avg(). Define a static sort method which sorts the array on 
  the basis of average. Display the player details in sorted order. 
 */

import java.util.Scanner;

class CricketPlayer {
    String name;
    int no_of_innings;
    int no_of_times_notout;
    int total_runs;
    float bat_avg;

    public void input() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Name of player : ");
        this.name = scan.nextLine();
        System.out.print("Total number of innings :");
        this.no_of_innings = scan.nextInt();
        System.out.print("Total number of not out :");
        this.no_of_times_notout = scan.nextInt();
        System.out.print("Enter total runs :");
        this.total_runs = scan.nextInt();
    }

    public static void avg(CricketPlayer[] player, int n) {
        for (int i = 0; i < n; i++) {
            int total_no_out = player[i].no_of_innings - player[i].no_of_times_notout;
            if(total_no_out!=0){
            player[i].bat_avg = player[i].total_runs / total_no_out;
            }
            else{
                System.out.println("All times player out");
            }
        }
    }

    public static void sort(CricketPlayer[] player, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (player[i].bat_avg < player[j].bat_avg) {
                    CricketPlayer temp = player[i];
                    player[i] = player[j];
                    player[j] = temp;
                }
            }
        }
    }

    void showDetails() {
        System.out.println("Name :" + this.name);
        System.out.println("Bating average :" + this.bat_avg + "\n") ;
        
    }
}

public class Ex2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter total player :");
        int n = scan.nextInt();
        CricketPlayer[] cp = new CricketPlayer[n];
        for (int i = 0; i < n; i++) {
            cp[i] = new CricketPlayer();
            cp[i].input();
        }

        CricketPlayer.avg(cp, n);
        CricketPlayer.sort(cp, n);
        for (int i = 0; i < n; i++) {

            cp[i].showDetails();
        }

    }
}
