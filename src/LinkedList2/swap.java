package LinkedList2;

import static LinkedList2.DeleteNode.print;

public class swap {
    public static void print(Node head){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static Node swapp(Node head){
        int k=1;
        Node first=head;

        for (int i=1;i<k;i++){
           first=first.next;
        }
        Node second = head;
        Node curr = first;
        while (curr.next != null) {
            curr = curr.next;
            second = second.next;
        }
        int temp=first.val;
        first.val=second.val;
        second.val=temp;

        return head;
        }
    public static void main(String[] args) {
        Node a=new Node(10);
        Node b=new Node(20);
        Node c=new Node(30);
        Node d=new Node(40);
        Node e=new Node(50);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;

        print(a);
        swapp(a);
        print(a);
    }
}
