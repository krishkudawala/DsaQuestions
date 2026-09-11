package LinkedListImportanatQuestions;

public class cycle {
    public static boolean cyclee(Node head) {
        Node temp = head;
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) ;
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

      if (cyclee(a)){
          System.out.println("Found");
      }
else System.out.println("Not found");
    }
}
