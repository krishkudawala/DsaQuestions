package Revesion;

public class towNumber {
    public static void main(String[] args) {
        int [] arr={2,4,6,8,9,6,3};
        int n= arr.length;
        int x=8;
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                if (arr[i]+arr[j]==x){
                    System.out.println(i+ " "+j);
                }
            }
        }
    }
}
