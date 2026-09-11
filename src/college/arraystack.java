package college;

import java.util.Stack;

public class arraystack {
    public static class stack{
      private   int [] arr=new int[5];
       private int idx=0;
        void push(int x){
//            if(isFull){
//                System.out.println("Stack is full");
//                return;
//            }
//            arr[idx]=x;
//            idx++;
        }
        int peek(){
            if(idx==0){
                System.out.println("The Stack is Empty");
                return -1;
            }
            return arr[idx-1];
        }
        void display(){
            for (int i=0;i<idx-1;i++){
                System.out.print(arr[i]+" ");
            }
        }
        int size(){
            return idx;
        }
        boolean isempty() {
            if (idx == 0) return true;
            return false;
        }

        boolean isFull(){
            if (arr.length==idx) return true;
            else return false;
        }
    }
    public static void main(String[] args) {
        Stack st=new Stack<>();
        st.push(1);
        st.push(2);
        st.peek();
        st.size();

    }
}
