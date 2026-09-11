package DoublyLinkedList;

class Node{
    int val;
    Node next;
    Node pre;
    Node (int val){
        this.val=val;
    }
}
class  DLL {
    private Node head;
    private Node tail;
    private int size;

    public static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void printreverse(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.pre;
        }
        System.out.println();
    }

    public static void display(Node head) {
        Node temp = head;
        while (temp.pre != null) {
            temp = temp.pre;
        }
        print(temp);
    }

    void insertAtEnd(int val) {
        Node temp = new Node(val);
        if (head == null) head = tail = temp;
        else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }

    void insertAtHead(int val) {
        Node temp = new Node(val);
        if (head == null) head = tail = temp;
        else {
            temp.next = temp;
            tail = temp;
        }
        size++;
    }

    void insert(int idx, int val) {
        if (idx == 0) {
            insertAtHead(val);
            return;
        }
        if (idx == size) {
            insertAtEnd(val);
            return;
        }
        if (idx > size || idx < 0) {
            System.out.println("Invalid index!!");
            return;
        }
        Node temp = new Node(val);
        Node x = head;
        for (int i = 0; i < idx - 1; i++) {
            x = x.next;
        }
        Node y = x.next;
        x.next = temp;
        temp.pre = x;
        y.pre = temp;
        temp.next = y;
        size++;
    }

    void deletathead() {
        if (head == null) throw new Error("List is empty");
        head = head.next;
        head.pre = null;
        size--;
    }

    void delete(int idx) throws Error {
        if (idx==0){
                deletathead();
                    return;
        }
        if (idx < 0 || idx >= size) throw new Error("List Invalid");
        Node temp = head;
        for (int i = 0; i < idx - 1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        temp=temp.next;
        temp.pre=temp.pre.pre;
        size--;
    }
}
public class DoublyLinkedListImplementation {
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);

        a.next=b;  b.pre=a;
        b.next=c;  c.pre=b;
        c.next=d;  d.pre=c;
//
//        print(a);
//        printreverse(d);
//        display(b);

        DLL  list=new DLL ();

        list.print(a);
        list.insert(2   ,300);
        list.print(a);
        list.deletathead();
        list.print(a);


    }
}
