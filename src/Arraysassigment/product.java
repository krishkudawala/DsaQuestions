package Arraysassigment;

public class product {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        int n=arr.length;
        int pdt=1;
        for (int i=0;i<n;i++){
          pdt*=arr[i];
        }
        System.out.println(pdt);
    }
}
