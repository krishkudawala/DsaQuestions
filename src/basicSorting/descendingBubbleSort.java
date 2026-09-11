package basicSorting;

public class descendingBubbleSort {
    public static void print(int[] arr){
        for (int ele : arr){
            System.out.print(ele+" ");
        }
    }
    public static void main(String[] args) {
        int [] arr={10,8,5,3,1};
        int n=arr.length;
        for (int x=1;x<n-1;x++){
            for (int i=0;i<n-1;i++){
                if (arr[i]>arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
        }
        print(arr);

    }
}
