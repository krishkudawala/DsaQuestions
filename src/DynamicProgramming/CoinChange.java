package DynamicProgramming;

public class CoinChange {
    public static long coinCount (int i,int[] coins, int amount) {
        if (i==coins.length){
            if (amount==0) return 0;
            else return Integer.MAX_VALUE;
        }
        long skip=coinCount(i+1,coins,amount);
        if (amount-coins[i]<0) return skip;
        long pick=1+coinCount(i,coins,amount-coins[i]);
        return Math.min(skip,pick);
    }
    public static int coinChange(int[] coins, int amount) {
        int ans=(int) coinCount(0,coins,amount);
        if(ans==Integer.MAX_VALUE) return -1;
        return ans;
    }
    public static void main(String[] args) {
        int[] coins={1,2,5};
        int amount=11;
        System.out.println(coinChange(coins,amount));
    }
}
