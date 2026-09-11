package college;

import java.util.Scanner;

public class FCFS {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter number of processes: ");
        int n=sc.nextInt();

        int[] bt = new int[n];
        int[] wt = new int[n];
        int[] tat = new int[n];

        System.out.println("Enter burst time of processes:");
        for (int i = 0; i < n; i++) {
            bt[i] = sc.nextInt();
        }


        wt[0] = 0;


        for (int i = 1; i < n; i++) {
            wt[i] = wt[i - 1] + bt[i - 1];
        }


        for (int i = 0; i < n; i++) {
            tat[i] = wt[i] + bt[i];
        }

        for (int i = 0; i < n; i++) {
            System.out.println("P" + (i + 1) + "  " + bt[i] + "  " + wt[i] + "  " + tat[i]);
        }

    }
}
