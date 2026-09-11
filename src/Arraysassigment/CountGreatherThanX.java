package Arraysassigment;

public class CountGreatherThanX {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        int n= arr.length;
        int x=1;
        int count=0;
        for (int i=0;i<n;i++){
            if (arr[i]>x){
                count++;
            }
        }
        System.out.println(count);
    }
}
