package Pratice;

public class bubblesort {
    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 5, 1, 3, 4, 3, 2, 3,7,6,7,8,7,5,9};
        int n = arr.length;
        for(int x=1;x<=n-1;x++){
            boolean flag=true;
            for (int i=0;i<n-1-x;i++){
                if (arr[i]>arr[i+1]){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                    flag=false;
                }
            }
            if (flag==true) {break;
        }
        }
        for (int ele:arr){
            System.out.print(ele+" ");
        }
    }

}