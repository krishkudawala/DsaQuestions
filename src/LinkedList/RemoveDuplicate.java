package LinkedList;

public class RemoveDuplicate {
    public static void print(Node head){
        Node temp=head;
        while (temp!=null){
            System.out.println(temp.val);
            temp=temp.next;
        }
    }
    public static Node remve(Node head){
        Node a=head;
        Node b=head;

        if (head==null) return head;
        while (b!=null){
            if (a.val==b.val){
                b=b.next;
            }
            else {
                a.next=b;
                a=b;
            }
        }
        a.next=null;
        return head;
    }
    public static void main(String[] args) {
        Node a=new Node(10);
        Node b=new Node(10);
        Node c=new Node(20);
        Node d=new Node(30);
        Node e=new Node(40);
        Node f=new Node(40);
        Node g=new Node(50);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=g;

        remve(a);
        print(a);



    }
}
