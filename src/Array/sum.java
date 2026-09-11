package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class sum {
    public static void main(String[] args) {
        int[] digits = {1, 2, 3};
        int n = digits.length;

        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                System.out.println(Arrays.toString(digits));
                return;
            }
            digits[i] = 0;
        }

        // If all digits are 9
        int[] result = new int[n + 1];
        result[0] = 1;
        System.out.println(Arrays.toString(result));
    }
}