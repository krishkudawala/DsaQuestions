package DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class PrefectSquare {
//    public static boolean isPrefect(int n) {
//        int sqrt=(int) (Math.sqrt(n));
//
//        return (sqrt*sqrt==n);
//
//    }
//    public static int numSquares(int n) {
//        if(isPrefect(n)) return 1;
//        int min=Integer.MAX_VALUE;
//        for(int i=1;i<=n/2;i++){
//            int count=numSquares(i)+numSquares(n-i);
//            min=Math.min(min,count);
//        }
//        return min;
//    }

    public static boolean isPrefect(int n) {
        int sqrt=(int) (Math.sqrt(n));

        return (sqrt*sqrt==n);

    }
    public static int minSquares(int n,int [] dp) {
        if(isPrefect(n)) return 1;
        if(dp[n]!=-1) return dp[n];
        int min=Integer.MAX_VALUE;
        for(int i=1;i*i<=n;i++){
            int count=minSquares(i*i,dp)+minSquares(n-i*i,dp);
            min=Math.min(min,count);
        }
        return dp[n]= min;
    }
    public static int numSquares(int n) {
        int [] dp=new int [n+1];
        Arrays.fill(dp,-1);
        return minSquares(n,dp);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        System.out.println(numSquares(n));

    }
}
