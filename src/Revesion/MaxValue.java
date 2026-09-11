package Revesion;

public class MaxValue {
    public static void main(String[] args) {
        int [] arr={2,3,4,8,6,1,2,222};
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max) max=arr[i];
        }
        System.out.println(max);
    }
}
