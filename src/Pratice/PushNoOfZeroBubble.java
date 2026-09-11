package Pratice;

public class PushNoOfZeroBubble {
    public static void main(String[] args) {
        int []arr={1,2,3,1,2,3,0,0,9,0,8,7,0};
        int noOfZero=0;
        int n=arr.length;
        for (int ele :arr){
            if (ele==0) noOfZero++;
        }
        for (int x=1;x<n-1;x++) {
            for (int i = 0; i < n - 1 - x; i++) {
                if (arr[i] == 0) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        for (int ele : arr){
            System.out.print(ele+" ");
        }
        }

}
