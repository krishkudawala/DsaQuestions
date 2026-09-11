package recursion2;

import java.util.Scanner;

public class MazeRat {
    public static int maze(int row , int col , int m ,int n) {
        if (col==m || row ==n) return 1;
        int rigntways=maze(row,col+1,m,n);
        int leftways=maze(row+1,col,m,n);
        return rigntways+leftways;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter No of Column : ");
        int n= sc.nextInt();
        System.out.print("Enter No of Row : ");
        int m= sc.nextInt();

        System.out.println("Total no of ways : "+maze(1,1,m,n));
    }
}
