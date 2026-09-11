package college;

public class product {
    public static void main(String[] args) {
        int [] arr={2,3,4,5,6,0};
        int sum=1;
        for(int i=0;i<arr.length;i++) {
            sum *= arr[i];
        }
        System.out.println(sum);
    }
}
