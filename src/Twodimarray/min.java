package Twodimarray;

public class min {
    public static void main(String[] args) {
        int [] [] arr={{1,2,3,4},{5,6,7,8}};
        int min= Integer.MAX_VALUE;
        int m =arr.length;
        int n =arr[0].length;
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                min = Math.min(min,arr[i][j]);
            }
        }
        System.out.println(min);
    }
}
