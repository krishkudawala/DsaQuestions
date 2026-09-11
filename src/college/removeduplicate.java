package college;

public class removeduplicate {
    public static void main(String[] args) {
        int[] arr = {1,1, 2,2, 3, 4, 5};
        int ans=0;
        int n = arr.length ;
        for (int i = 0; i < n-1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[ans++] = arr[i];
            }
        }
        arr[ans++]=arr[n-1];
        for (int i=0;i<ans;i++){
            System.out.print(arr[i]+" ");
        }
    }
    }

