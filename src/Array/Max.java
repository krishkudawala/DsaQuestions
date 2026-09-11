package Array;

public class Max {
    public static void main(String[] args) {
        int [] arr = {10,8,43,12,5,56,3};
        int max=Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            if (arr[i]>max) max=arr[i];

        }
        System.out.println(max);

    }
}
