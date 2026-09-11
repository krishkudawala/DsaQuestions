package Greedy;

import java.util.Arrays;
import java.util.Scanner;

public class BoatesToSamePeople {
    public static int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int left=0, right =people.length-1;
        int ans=0;
        while (left<=right) {
            if (people[left] + people[right] <= limit) {
                left++;
                right--;
            } else {
                right--;
            }
            ans++;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int limit=3;
        System.out.println(numRescueBoats(arr,limit));
    }
}
