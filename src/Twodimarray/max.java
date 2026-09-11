package Twodimarray;

public class max {
    public static void main(String[] args) {
        int [] [] arr = {{1,2,3},{4,5,6},{10,12,11}};
        int max = Integer.MIN_VALUE;
        int m =arr.length;
        int n =arr[0].length;
        for (int i=0;i<m;i++) {
            for (int j = 0; j < n; j++) {
                max = Math.max(max, arr[i][j]);
            }
        }
            System.out.println(max);
        }
    }

