package LinkedList2;

public class reverseII {
    public static void print(Node head){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    public static Node rev(Node head) {
        Node Nexxt = null;
        Node curr = head;
        Node pre = null;
        while (curr != null) {
            Nexxt = curr.next;
            curr.next = pre;
            pre = curr;
            curr = Nexxt;
        }
        return pre;
    }
    public static Node reverse(Node head ,int left,int right){
        if (head.next!=null || left==right) return head;
        Node a=null, b=null, c=null, d=null;
        Node temp=head;
        int pos=1;
        while (temp!=null){
            if (pos==left-1) a=temp;
            if (pos==left)   b=temp;
            if (pos==right)  c=temp;
            if (pos==right+1)d=temp;
            temp=temp.next;
            pos++;
        }
        if (a!=null) a.next=null;
        if (c!=null) c.next=null;
        rev(b);
        if (a!=null) a.next=c;
        b.next=d;
        if (a==null) return c;
        return head;

    }
    public static void main(String[] args) {
        Node a=new Node(10);
        Node b=new Node(20);
        Node c=new Node(30);
        Node d=new Node(40);
        Node e=new Node(50);
        Node f=new Node(60);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;

       a= reverse(a,1,3);
        print(a);
    }
}
