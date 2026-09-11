package DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class MinCostClimbingStairs {
    public static int minCost(int[] cost,int idx,int [] dp) {
        if(idx==0 || idx==1) return cost[idx];
        if(dp[idx] !=-1) return dp[idx];
        return dp[idx] = cost[idx] +Math.min(minCost(cost,idx-1,dp) , minCost(cost,idx-2,dp));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int c=sc.nextInt();
        int cost [] =new int[c];
        int n=cost.length;
        for (int i=0; i<c;i++){
            cost[i]= sc.nextInt();
        }
        int [] dp=new int [n];
        Arrays.fill(dp,-1);
        System.out.println(Math.min(minCost(cost,n-1,dp),minCost(cost,n-2,dp   )));
    }
}
