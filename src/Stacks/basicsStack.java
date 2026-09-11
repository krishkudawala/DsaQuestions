package Stacks;

import java.util.Stack;

public class basicsStack {
    public static void main(String[] args) {
        Stack <Integer> st=new Stack<>();
        System.out.println(st.isEmpty());
        st.push(1);
        st.push(5);
        st.push(4);
        st.push(6);
        System.out.println(st);
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st.size());
        st.push(2);
        st.push(6);
        while (st.size()>1){
            st.pop();
        }
        System.out.println(st.size());
    }
}
