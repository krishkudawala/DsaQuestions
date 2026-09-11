package Stacks;

public class ArrayImplementation {
    public static class stack{
   private int []arr=new int[5];
   private int idx=0;

   void push(int x){
     if (isfull()){
         System.out.println("Stck is full");
         return;
     }
     arr[idx]=x;
     idx++;
   }
int peek(){
       if (idx==0){
           System.out.println("The stack is empty");
           return -1;
       }
       return arr[idx-1];
}
int pop(){
       if (isempty()){
           System.out.println("Empty");
           return -1;
       }
       int top=arr[idx-1];
       arr[idx-1]=0;
       idx--;
       return top;
}
void display(){
       for (int i=0;i<=idx-1;i++){
           System.out.println(arr[i]);
       }
}
int size(){
       return idx;
}
boolean isempty(){
       if (idx==0) return true;
       return false;
}
boolean isfull(){
       if (arr.length==idx) return true;
       else return false;
}
    }
    public static void main(String[] args) {
     stack st=new stack();
     st.push(1);
     st.push(2);
     st.push(3);
     st.push(4);
     System.out.println(st.peek());
    }
}
