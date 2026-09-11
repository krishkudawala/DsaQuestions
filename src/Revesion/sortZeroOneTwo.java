package Revesion;

public class sortZeroOneTwo {
    public static void main(String[] args) {
        int [] arr={1,0,2,1,1,2,2,2,0,0,1,0,2};
        int n=arr.length;
        int noofzero=0;
        int noofones=0;

        for (int i=0 ;i<n;i++){
            if (arr[i]==0) noofzero++;
            if (arr[i]==1) noofones++;
        }
        for (int i=0;i<n;i++){
            if (i<noofzero) arr[i]=0;
            else if (i<noofones+noofzero) arr[i]=1;
            else arr[i]=2;
        }
        for (int ele :arr) {
            System.out.print(ele+" ");
        }
    }
}
