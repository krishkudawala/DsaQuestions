package college;

public class floorbinary {
    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 10, 10, 12, 19};
        int x = 6;
        int n = arr.length;
        int lo = 0, hi = n - 1;
        int lb = n;
        boolean flag = false;
        while (lo <= hi) {
            int mid =lo+ (hi-lo) / 2;
            if (arr[mid] >= x) {
                lb = Math.max(lb, mid);
                hi = mid - 1;
                flag = true;
            } else
                lo = mid + 1;
        }
        if (flag==true) System.out.println("found");
        else System.out.println("no found");
    }



}

