package Stacks;

import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
//        Stack<Integer> st = new Stack<>();
//        st.push(1);
//        st.push(3);
//        st.push(2);
//        st.push(1);
//        st.push(8);
//        st.push(6);
//        st.push(3);
//        st.push(4);
        int [] arr={1,3,2,1,8,6,3,4};

        int [] res=new int[arr.length];
        int n=res.length;

        for (int i=0;i<n-1;i++) {
            for (int j = i + 1; j < n-1; j++) {
                if (arr[j] > arr[i]) {
                    res[i] = arr[j];
                }
            }
        }
        for (int ele :res){
            System.out.print(ele+" ");
        }
    }
}
