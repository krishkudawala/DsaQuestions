package Queue;

import java.util.Queue;

class queue{
int f=-1;
int r=-1;
int size;
int [] arr=new int[5];

 public void add(int val){
if(r==arr.length-1){
    System.out.println("Queue is full");
    return;
}
if(f==-1&&r==-1){
    f=r=0;
arr[r]=val;
}
else {
    arr[++r]=val;
}

     }
     public int remove(){
     if(size==0){
         System.out.println("Queue is Empty");
         return -1;
     }
     f++;
     size--;
     int val=arr[f++];
     size--;
      return val;
     }
     public int peek(){
     if (size==0){
         System.out.println("Queue is Empty");
         return -1;
     }
     return arr[f];
     }
     public boolean isEmpty(){
     if (size==0) return true;
     return false;
     }
     public void Display(){
     if(size==0){
         System.out.println("Queue is empty");

     }
     else {
         for(int i=f;i<=r;i++) {
             System.out.println(arr[i]);
         }
     }
         System.out.println();
     }
  }
public class ArrayImplementation {
    public static void main(String[] args) {
        queue q=new queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        q.Display();
        System.out.println(q.size);
    }

}
