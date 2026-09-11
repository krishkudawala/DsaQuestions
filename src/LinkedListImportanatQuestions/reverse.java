package LinkedListImportanatQuestions;
class Node{
    int val;
    Node next;
    Node (int val){
        this.val=val;
    }
}
public class reverse {
    public static void print(Node head){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static Node reverse(Node head){
        Node next=head;
        Node curr=head;
        Node pre=null;
        while (curr!=null){
            next=curr.next;
            curr.next=pre;
            pre=curr;
            curr=next;
        }
        return pre;
    }
    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;

        print(a);
        reverse(a);
        print(e);
    }
}
