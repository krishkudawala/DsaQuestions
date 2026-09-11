package Binarysearch;

public class peakIndex {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 50, 40, 20};
        int n = arr.length;
        int lo = 1, hi = n - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) ;
            else if (arr[mid] > arr[mid - 1] && arr[mid] < arr[mid + 1]) lo = mid + 1;
            else if (arr[mid] < arr[mid - 1] && arr[mid] > arr[mid + 1]) hi = mid - 1;
            System.out.println(mid);
            break;
        }
    }
}
