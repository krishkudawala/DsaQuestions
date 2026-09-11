package Array;

public class count {
    public static void main(String[] args) {
       int [] arr={1,2,3,4,5};
       int n=arr.length;
       int count =n-1;
       for (int i=0;i<n;i++){
           n/=10;
           count++;
       }
        System.out.println(count);
    }
}
