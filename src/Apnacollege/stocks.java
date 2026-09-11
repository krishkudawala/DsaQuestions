package Apnacollege;

public class stocks {
    public static void main(String[] args) {
        int[] arr = {7,6,4,3,1};
        int n = arr.length;
        int profit = 0;
        int min = Integer.MAX_VALUE;
        int lock = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
                lock = i;
            }
        }
        System.out.println("Buy stock at => " + min);

        int max = arr[lock];
        for (int i = lock; i < n; i++) {
            if (arr[i] > max) max = arr[i];
        }
        System.out.println("Sell stock at => " + max);

        profit = max - min;
        System.out.println("Profit of the stocks => " + profit);
    }
}
