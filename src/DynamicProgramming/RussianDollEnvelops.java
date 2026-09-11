package DynamicProgramming;

import java.util.Arrays;

public class RussianDollEnvelops {
    public static class Enveolps implements Comparable<Enveolps>{
        int w;
        int h;
        Enveolps(int w ,int h){
            this.w=w;
            this.h=h;
        }
        public  int compareTo(Enveolps e){
            if(this.w==e.w)  return e.h - this.h;
            return this.w-e.w;

        }
    }
    public static int maxEnvelopes(int[][] envelopes) {
        int n=envelopes.length;
        Enveolps [] arr=new Enveolps [n];
        for(int i=0;i<n;i++){
            int w=envelopes[i][0];
            int h=envelopes[i][1];
            arr[i] = new Enveolps(w,h);
        }
        Arrays.sort(arr);

        int [] dp=new int[n];
        int max=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i-1;j++){
                if(arr[j].h<arr[i].h)
                    dp[i]=Math.max(dp[i],dp[j]);
            }
            dp[i]+=1;
            max=Math.max(max,dp[i]);
        }
        return max;
    }
    public static void main(String[] args) {
        int [][] envelopes={{5,4},{6,4},{6,7},{2,3}};
        System.out.println(maxEnvelopes(envelopes));
    }
}
