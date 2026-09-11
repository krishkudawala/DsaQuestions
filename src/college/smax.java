package college;

public class smax {
    public static void main(String[] args) {
        int []arr={9,2,3,4,2,4,5,6};
        int n =arr.length;
        int max=Integer.MIN_VALUE;
        for (int i=0;i<n;i++){
            if (arr[i]>max) max=arr[i];
        }
        int smax=Integer.MIN_VALUE;
        for (int i=0;i<n;i++){
            if (arr[i]> smax && arr[i]!=max) smax=arr[i];
        }
        System.out.println(smax);
    }
}
