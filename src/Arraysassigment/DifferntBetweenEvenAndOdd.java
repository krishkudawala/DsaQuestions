package Arraysassigment;

public class DifferntBetweenEvenAndOdd {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,6,7,8};
        int n=arr.length;
        int evensum=0;
        int oddindex=0;
        for (int i=0;i<n;i++){
            if (i%2==0) {
                evensum+=arr[i];
            }
            else {
                oddindex+=arr[i];
            }
        }
       int diff=evensum-oddindex;
        System.out.println("EvenIndexSum"+evensum);
        System.out.println("OddIndexSum"+oddindex);
        System.out.println("Differnt"+diff);
    }
}
