package Arraysassigment;

public class secondlargest {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,4,3,6,7};
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        for (int i=0;i<n;i++){
            if (arr[i]>max) max=arr[i];
        }
       // System.out.println(max);
        for (int i=0;i<n;i++){
            if (arr[i]>max2 && arr[i]!=max) max2=arr[i];
        }
        System.out.println("Second maximum in array=> "+max2);
    }
}
