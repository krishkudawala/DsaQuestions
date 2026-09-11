package Pratice;
class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}
class sll{
    Node head;
    Node tail;
    int size;
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
    }
    void delete(int idx) throws Error{
        if (idx<0 || size>=idx) throw new Error("Invalid index");
        Node temp=head;
        for (int i=0;i<idx-1;i++){
            temp=temp.next;
        }
        if (temp.next==tail) tail=temp;
        temp.next=temp.next.next;
        size--;
    }
    void size(){
        System.out.println(size);

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
        Node temp=new Node(val);
        Node x=head;
        for (int i = 0; i < idx - 1; i++) {
            x = x.next;
        }
        temp.next = x.next;
        x.next = temp;
        size++;
    }
}
public class Linkedlist {
    public static void main(String[] args) {
        sll list=new sll();
        list.insertAtHead(1);
        list.insert(0,1);
        list.insert(1,1);
        list.insert(2,2);
        list.insert(3,3);
        list.insert(4,4);
        list.display();
        list.size();
    }
}



