package Pratice;

public class duchflagalgo {
    public static void swap(int []arr,int mid ,int lo){
        int temp=arr[mid];
        arr[mid]=arr[lo];
        arr[lo]=temp;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 0, 0, 1, 2, 1, 0, 0, 1, 2};
        int n = arr.length;
        int lo = 0, mid = 0, hi = n - 1;
        while (mid <= hi) {
            if (arr[mid] == 0) {
                swap(arr,mid,lo);
                lo++;

            } else if (arr[mid] == 1) mid++;
            else {
                swap(arr,mid,hi);
                hi--;
            }
        }
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}

