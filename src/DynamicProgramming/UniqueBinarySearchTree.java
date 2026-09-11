package DynamicProgramming;

import java.util.Scanner;

public class UniqueBinarySearchTree {
    public static int numsTree(int n){
        if (n<=1) return 1;
        int [] dp=new int[n+1];
        dp[0]=1; dp[1]=1 ; dp[2]=2;
        for (int i=3;i<=n;i++){
            for (int j=1;j<=i;j++){
                dp[i]+=(dp[j-1]*dp[i-j]);
            }
        }
        return dp[n];
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter No");
        int n=sc.nextInt();
        System.out.println(numsTree(n));
    }
}
