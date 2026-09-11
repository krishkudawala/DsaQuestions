package college;

public class minvalue {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7,8};
        int n =arr.length;
        int min = Integer.MAX_VALUE;
        for (int i=0;i<n;i++){
            if (arr[i]<min) min=arr[i];
        }
        System.out.println(min);
    }
}
