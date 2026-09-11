package college;

public class movezero {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        int n = arr.length;
        int i = 0;
        int j = n ;
        int k = 0;
        while (i <= j) {
            if (arr[i] != 0) {
                arr[k] = arr[i];
                k++;
            }


        }

        while (k <= j) {
            arr[k] = 0;
            k++;
        }
        for (int ele : arr) {
            System.out.print(ele + " ");
        }

    }
}

