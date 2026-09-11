package Array;

public class ArrayisSortedornot {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7,8,9};
        int n=arr.length;
        boolean flag=true;
        for (int i=0;i<n-1;i++) {
            if (arr[i] > arr[i + 1]) {
                flag = false;
                break;
            }
        }
        if (flag==true) System.out.println("sorted");
        else System.out.println("Not sorted");
    }
}
