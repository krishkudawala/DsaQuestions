package PreFixSum;

import java.util.Arrays;

public class NumArray {
   static int[] arr;
    public NumArray(int[] nums) {
        arr= Arrays.copyOf(nums,nums.length);
        for(int i=1;i<nums.length;i++){
            arr[i]+=arr[i-1];
        }
    }

    public static int sumRange(int left, int right) {
        if(left==0) return arr[right];
        return arr[right] - arr[left-1];
    }

    public static void main(String[] args) {

        int nums[] = {1,2,3,4,5,6};

        NumArray obj = new NumArray(nums);

        System.out.print(obj.sumRange(0,2)+" ");
        System.out.println();
    }

}

