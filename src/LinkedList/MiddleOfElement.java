package LinkedList;
public class MiddleOfElement {
    public static void middle(Node head){
//        Node temp=head;
//        int len=0;
//        while (temp!=null){
//            temp=temp.next;
//            len++;
//        }
//        int mid=len/2+1;
//        temp=head;
//
//        for (int i=0;i<mid-1;i++){
//            temp=temp.next;
//        }
//        System.out.println(temp.val);

        Node slow=head;
        Node fast=head;
        while (fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        System.out.println(slow.val);
    }

    public static void main(String[] args) {
            Node a=new Node(10); // head
            Node b=new Node(20);
            Node c=new Node(30);
            Node d=new Node(40);
            Node e=new Node(50);
            Node f=new Node(60);
            a.next=b; //10->20
            b.next=c; //10->20->30
            c.next=d; //10->20->30->40
            d.next=e; //10->20->30->40->50
            e.next=f; //10->20->30->40->50->60
        middle(a);

    }
}
