package college;

public class secondmax {
    public static void main(String[] args) {
        int [] arr={10000000,20,32,41,54,65,7666,80};
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        for (int i=0;i<n;i++){
            if (max<arr[i]) max=arr[i];
        }
        int smax=Integer.MIN_VALUE;
        for (int i=0;i<n;i++){
            if (smax<arr[i] && max!=arr[i]) smax=arr[i];
        }
      //  System.out.println(max);
        System.out.println(smax);
    }
}
