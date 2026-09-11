package LinkedList;

public class Merge {
    public static void print(Node head){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
    }
    public static Node merge(Node head1 , Node head2){
        Node dummp=new Node(-1);
        Node temp=dummp;
        Node temp1=head1;
        Node temp2=head2;

        while (temp1!=null && temp2!=null){
            if (temp1.val<temp2.val){
                temp.next=temp1;
                temp1=temp1.next;
            }
            else {
                temp.next=temp2;
                temp2=temp2.next;
            }
            temp=temp.next;
        }
        if (temp1==null) temp.next=temp2;
        else temp.next=temp1;
        return dummp.next;
    }
    public static void main(String[] args) {
        Node a1=new Node(10);
        Node a2=new Node(30);
        Node a3=new Node(50);
        Node a4=new Node(70);
        a1.next=a2;
        a2.next=a3;
        a3.next=a4;

        Node b1=new Node(20);
        Node b2=new Node(40);
        Node b3=new Node(60);
        Node b4=new Node(80);
        b1.next=b2;
        b2.next=b3;
        b3.next=b4;

       Node merged= merge(a1 ,b1);
        print(merged);

    }
}
