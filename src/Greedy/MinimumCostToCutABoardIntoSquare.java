package Greedy;

import java.util.Arrays;
import java.util.Collections;

public class MinimumCostToCutABoardIntoSquare {
    public static void main(String[] args) {
        int m=6 ,n=4;
        Integer [] y={2,1,2,1,4};
        Integer[] x={4,1,2};
        System.out.println(costofbreaking(x,y,m-1,n-1));
    }

    private static int costofbreaking(Integer[] x, Integer[] y, int m, int n) {
        int res=0;
        Arrays.sort(x, Collections.reverseOrder());
        Arrays.sort(y, Collections.reverseOrder());

        int hori=1 ,vrt=1;

        int i=0, j=0;
        while (i<m && j<n){
            if (x[i]>y[j]){
                 res+=x[i]*vrt;
                 hori++;
                 i--;
            }
            else {
                res+=y[j]*hori;
                vrt++;
                j++;
            }
        }
        int total=0;
        while (i<m)
            total+=x[j++];
            res+=total*vrt;
        total=0;
        while (j<n)
            total+=y[j++];
        res+=total*hori;
        return res;
    }
}
