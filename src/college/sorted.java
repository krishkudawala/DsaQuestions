package college;

public class sorted {
    public static void main(String[] args) {
        int [] arr ={1,2,3,4,5};
        int n =arr.length;
        boolean flag =true;
        for (int i=0;i<n-1;i++){
            if (arr[i]>arr[i+1]){
                flag=false;
                break;
            }
        }
        if (flag==true) System.out.println("Array is sorted");
        else System.out.println("Array is not sorted");
    }
}
