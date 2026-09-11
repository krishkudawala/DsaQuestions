package LinkedList2;

public class DeleteNode {
    public static void print(Node head){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void deleteode(Node node){
     node.val=node.next.val;
     node.next=node.next.next;
    }
    public static void main(String[] args) {
        Node a=new Node(10);
        Node b=new Node(20);
        Node c=new Node(30);
        Node d=new Node(40);
        Node e=new Node(40);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        print(a);

        deleteode(c);
        print(a);
    }
}
