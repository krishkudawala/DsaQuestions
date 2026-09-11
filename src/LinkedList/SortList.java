package LinkedList;

public class SortList {
    public static void print(Node head){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static Node merge(Node head1, Node head2) {
        Node dummp = new Node(-1);
        Node temp = dummp;
        Node temp1 = head1;
        Node temp2 = head2;

        while (temp1 != null && temp2 != null) {
            if (temp1.val < temp2.val) {
                temp.next = temp1;
                temp1 = temp1.next;
            } else {
                temp.next = temp2;
                temp2 = temp2.next;
            }
            temp = temp.next;
        }
        if (temp1 == null) temp.next = temp2;
        else temp.next = temp1;
        return dummp.next;
    }
    public static Node sort (Node head) {
        if (head == null || head.next == null) return head;
        Node firsthalf = head;
        Node slow = head;
        Node fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node secondhalf = slow.next;
        slow.next = null;
        firsthalf=sort(firsthalf);
        secondhalf=sort(secondhalf);
        Node ans=merge(firsthalf,secondhalf);
        return ans;
    }

    public static void main(String[] args) {
        Node a=new Node(10);
        Node b=new Node(30);
        Node c=new Node(50);
        Node d=new Node(20);
        Node e=new Node(70);
        Node f=new Node(90);
        Node g=new Node(80);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=g;
        print(a);
        sort(a);
        print(a);

    }
}