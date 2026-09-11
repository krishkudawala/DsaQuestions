package sorting;

public class boobleOptimized {
    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 4, 3, 1, 2, 9};
        int n = arr.length;
        for (int x=1;x<n-1;x++){
            for (int i=0;i<n-1-x;i++){
                if (arr[i]>arr[i+1]){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }
        for (int ele :arr){
            System.out.print(ele+" ");
        }
    }
}
