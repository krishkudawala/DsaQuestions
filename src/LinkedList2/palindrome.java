package LinkedList2;

import static LinkedList2.ReverseRecursive.print;

public class palindrome {
    public static Node reverse(Node head){
        Node curr=head;
        Node pre=null;
        Node Next=head;
        while (curr!=null){
            Next=curr.next;
            curr.next=pre;
            pre=curr;
            curr=Next;
        }
        return pre;
    }
    public static boolean palimdrome(Node head){
        Node slow=head;
        Node fast=head;
        while (fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node j=reverse(slow);
        Node i=head;
        while (j!=null){
            if (i.val!= j.val) return false;
            i=i.next;
            j=j.next;
        }
        return true;
    }
    public static void main(String[] args) throws java.lang.Exception {
        Node a=new Node(10);
        Node b=new Node(20);
        Node c=new Node(30);
        Node d=new Node(20);
        Node e=new Node(10);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        print(a);
        System.out.println();
        if (palimdrome(a)){
            System.out.println("yes");
        }
        else {
            System.out.println("Not");
        }

    }
}
