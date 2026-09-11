package Stacks;

import java.util.Stack;

public class PreviousGreatestElement {
    public static void preGreater(int [] arr,int n){
        Stack <Integer> st=new Stack<>();
        st.push(arr[0]);
        System.out.println("-1");
        for (int i=0;i<n;i++){
            while (!st.isEmpty() && st.peek() <=arr[i])
                st.pop();
            if (st.isEmpty())
                System.out.println("-1");
            else
                System.out.println(st.peek()+" ");
            st.push(arr[i]);
        }
    }
    public static void main(String[] args) {
        int[] arr = {10, 4, 2, 520, 40, 12, 20};
        int n = args.length;
        preGreater(arr, n);
    }
}
