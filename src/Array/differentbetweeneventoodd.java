package Array;

public class differentbetweeneventoodd {
    public static void main(String[] args) {
        int[] arr = {4, 7, 2, 9, 6, 1};
        int sum = 0;
        int sum2=0;
       for (int i=0;i<arr.length;i++) {
           if (i % 2 == 0) sum += arr[i];
           else if (i%2!=0) sum2+=arr[i];
       }
       System.out.println("Sum of the even number=> "+sum);
        System.out.println("Sum of the odd number=> "+sum2);
        System.out.println("Difference of the sum of odd and even numer=> "+(sum-sum2));

    }

}

