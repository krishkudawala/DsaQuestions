package college;

import java.util.Stack;

public class StackLinkedImp {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }
    public static class stack{
        Node head=null;
        int size=0;
        void push(int x){
            Node temp=new Node(x);
            temp.next=head;
            head=temp;
            size++;
        }
        int size(){
            return size;
        }
        int pop(){
            if(head==null){
                System.out.println("Stack is empty");
                return -1;
            }
            int x=head.val;
            head=head.next;
            size--;
            return x;
        }
    }

    public static void main(String[] args) {
        stack st=new stack();
    }
}
