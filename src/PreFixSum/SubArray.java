package PreFixSum;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SubArray {
    public static int subarraySum(int[] arr, int k) {
        int count = 0;
        int n = arr.length;
        for(int i=1;i<n;i++){
            arr[i]+=arr[i-1];
        }
        Map<Integer,Integer> map=new HashMap<>();
        for (int i=0;i<n;i++){
            int ele =arr[i];
            if (ele==k) count++;
            int rem=ele-k;
            if (map.containsKey(rem)) count+=map.get(rem);
            if (map.containsKey(ele)) {
                int freq=map.get(ele);
                map.put(ele,freq+1);
            }
            else map.put(ele,1);
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=2;
        System.out.println(subarraySum(arr,k));

    }
}
