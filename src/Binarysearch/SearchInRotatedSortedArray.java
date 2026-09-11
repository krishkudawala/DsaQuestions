package Binarysearch;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int [] arr={};
        int n =arr.length;
        int target=2;
        int lo=0 , hi=n-1;
        int p=-1;
        while (lo<=hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                p = mid;
                break;
            } else if (arr[mid] < arr[mid - 1] && arr[mid] < arr[mid + 1]) {
                p = mid - 1;
                break;
            }
           else if (arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1]);
            if (arr[mid]>arr[n-1]) lo=mid+1;
            else hi=mid-1;
        }
    }
}
