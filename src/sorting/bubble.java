package sorting;

public class bubble {
    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 5, 3, 1, 3, 2};
        int n = arr.length;
            for (int x = 1; x < n - 1; x++) {
                for (int i = 0; i < n - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        for (int ele:arr) {
                System.out.print(ele+" ");
        }
    }
}
