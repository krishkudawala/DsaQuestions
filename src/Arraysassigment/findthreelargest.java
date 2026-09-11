package Arraysassigment;

public class findthreelargest {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;

        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        int tmax = Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++) {
            if (arr[i] > max) {
                tmax = smax;
                smax = max;
                max = arr[i];
            }
            else if (arr[i] > smax && arr[i] != max) {
                tmax = smax;
                smax = arr[i];

            }
            if (arr[i] > tmax && arr[i] != smax && arr[i] != max) {
                tmax = arr[i];
            }
        }
        System.out.println(tmax);
    }
}

