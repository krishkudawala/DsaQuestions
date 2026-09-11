package college;

import java.util.Arrays;

public class builtinsort {
    public static void main(String[] args) {
        int[] arr = {7, 4, 1, 2, 3};
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        Arrays.sort(arr);
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}
