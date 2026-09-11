package college;

public class stocks {
    public static void main(String[] args) {
        int[] arr = {7,6,4,3,1};
        int n = arr.length;
        int lock = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i=0;i<n;i++){
            if (arr[i]<=min)  min=arr[i];
        }
        for (int i=min;i<n;i++){
            if (arr[i]>max) max=arr[i];
        }

        lock=max-min;
        System.out.println(lock);
    }


}