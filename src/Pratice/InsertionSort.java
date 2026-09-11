package Pratice;

public class InsertionSort {
    public static void print(int []arr){
        for (int ele : arr){
            System.out.print(ele+" ");
        }
    }
    public static void swap(int []arr , int i ,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
        int []arr={5,4,3,2,1};
        int n =arr.length;
        for (int x=1;x<n;x++){
            for (int i=x;i>=1;i--){
                if (arr[i]<arr[i-1])
                    swap(arr,i,i-1);
                else break;
            }
        }
        print(arr);
    }
}
