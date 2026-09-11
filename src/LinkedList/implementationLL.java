package LinkedList;

import java.util.ArrayList;

class sll{ // user define data structure
       private Node head;
       private Node tail;
       private int size;
       void insertAtEnd(int val){
            Node temp= new Node(val);
            if (head==null) head =tail =temp;
            else {
                tail.next=temp;
                tail=temp;
            }
            size++;
        }
       void insertAtHead(int val){
        Node temp= new Node(val);
        if (head==null) head =tail =temp;
        else {
            temp.next=temp;
            tail=temp;
        }
        size++;
    }
       void insert(int idx , int val){
            if (idx==0){
                insertAtHead(val);
                return;
            }
            if (idx==size){
                insertAtEnd(val);
                return;
            }
            if (idx>size  || idx<0){
                System.out.println("Invalid index!!");
                return;
            }
            Node temp=new Node(val);
            Node x =head;
            for (int i=0;i<idx-1;i++){
                x = x.next;
            }
            temp.next=x.next;
            x.next=temp;
            size++;
    }
       int getele(int inx) throws Error{
      if (inx==size-1) return tail.val;
      if (inx>=size || inx<0) {
          throw new Error("Envalid");
      }
      Node temp=head;
      for (int i=1;i<=inx;i++){
          temp=temp.next;
      }
      return temp.val;
    }
       void setele(int inx ,int val) throws Error{
        if (inx==size-1) {
            tail.val = val;
        }
        if (inx>=size || inx<0) {
            throw new Error("Envalid");
        }
        Node temp=head;
        for (int i=1;i<=inx;i++){
            temp=temp.next;
        }
        temp.val=val;
    }
       void deleteAthead() throws Error{
            if (head==null) throw new Error("List is empty");
            head=head.next;
            size--;
    }
       void delete(int idx) throws Error{
           if (idx<0 || idx>=size)throw new Error("List Invalid");
           Node temp =head;
           for (int i=0;i<idx-1;i++) {
               temp = temp.next;
           }
           if (temp.next==tail) tail=temp;
           temp.next=temp.next.next;
           size--;
       }
       void display(){
                Node temp=head;
                while (temp!=null){
                    System.out.print(temp.val+" ");
                    temp=temp.next;
                }
            System.out.println();
            }
            void middle(){
           Node slow=head;
           Node fast=head;
           while (fast!=null && fast.next!=null){
               slow=slow.next;
               fast=fast.next.next;
           }
                System.out.println("This is the middle of the Linked List: "+slow.val);
    }
            void size(){
                System.out.println(size);
            }
        }
public class implementationLL {
    public static void main(String[] args) {
    //ArrayList<Integer> arr=new ArrayList<>();
        sll list = new sll();
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);
        list.insertAtEnd(29);
        list.display();
        list.size();
        list.insertAtHead(50);
        list.display();
        list.insert(7,200);
        list.display();
       // System.out.println(list.getele(-1 ));
        list.deleteAthead();
        list.display();
     //   list.size();
        list.delete(2);
        list.display();
        list.middle();
    }
}
