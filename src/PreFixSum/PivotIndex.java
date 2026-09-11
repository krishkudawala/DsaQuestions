package PreFixSum;

public class PivotIndex {
    public static int pivotIndex(int[] nums) {
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            nums[i] += nums[i - 1];
        }
        for (int i = 0; i < n; i++) {
            int leftSum = 0;
            if (i > 0) leftSum = nums[i - 1];
            int rightSum = nums[n - 1] - nums[i];
            if (leftSum == rightSum) return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] arr={1,7,3,6,5,6};
        System.out.println(pivotIndex(arr));
    }
}
