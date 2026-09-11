package college;

public class thirdmax {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        int thirdmax = Integer.MIN_VALUE;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                thirdmax = smax;
                smax = max;
                max = arr[i];
            }
            else if(arr[i]!=max && arr[i]>smax){
                smax=arr[i];
            }
            else if(arr[i]>=thirdmax && arr[i]!=smax && arr[i]!=max){
                thirdmax=arr[i];
            }
        }
        System.out.println(max +" "+smax+" "+thirdmax);
    }
}
