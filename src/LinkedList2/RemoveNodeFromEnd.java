package LinkedList2;



public class RemoveNodeFromEnd {
    public static void print(Node head){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
//    public static Node remove(Node head){
//        int len=0;
//        int n=5;
//        Node temp=head;
//        while (temp!=null){
//            len++;
//            temp=temp.next;
//        }
//        if (len==n) return head.next;
//        temp=head;
//        for (int i=0;i<len-n-1;i++){
//            temp=temp.next;
//        }
//        temp.next=temp.next.next;
//        return head;
//    }
    public static Node remove(Node head){
        int n=3;
        Node slow=head;
        Node fast=head;
        for (int i=0;i<n;i++){
            fast=fast.next;
        }
        if (fast==null) return head.next;
        while (fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
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
        remove(a);
        print(a);
    }
}
