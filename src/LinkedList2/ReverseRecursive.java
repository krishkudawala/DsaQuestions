package LinkedList2;
class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
    }
}
public class ReverseRecursive {
    public static void print(Node head){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
    }
    public static Node reverse(Node head){
        if (head==null || head.next==null) return head;
        Node a=head.next;
        Node newhead=reverse(a);
        a.next=head;
        head.next=null;
        return newhead;
    }
    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);

        a.next=b;
        b.next=c;
        c.next=d;

       Node head=reverse(a);
       print(head);
    }
}
