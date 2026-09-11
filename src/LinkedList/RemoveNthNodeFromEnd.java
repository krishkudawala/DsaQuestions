package LinkedList;

import java.util.Scanner;

public class RemoveNthNodeFromEnd {
    public static void print(Node head){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static Node  remove(Node head) {
//        Scanner sc=new Scanner(System.in);
//        Node temp=head;
//        int len=6;
//        System.out.println("Enter Node : ");
//        int n= sc.nextInt();
//        if(n==len) return head.next;
//        for(int i=0;i<len-n-1;i++){
//            temp=temp.next;
//        }
//        temp.next=temp.next.next;
//        return head.next;
//
         Node slow=head;
         Node fast=head;
         int n=2;
          for(int i=0;i<n;i++){
              fast=fast.next;
          }
          if (fast==null) {
           return head.next;
          }
          while (fast.next!=null){
              slow=slow.next;
              fast=fast.next;
          }
          slow.next=slow.next.next;
          return head.next;
    }
    public static void main(String[] args) {
        Node a =new Node(10);
        Node b =new Node(20);
        Node c= new Node(30);
        Node d= new Node(40);
        Node e= new Node(50);
        Node f =new Node(60);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        print(a);
        remove(a);
        print(a);
    }
}
