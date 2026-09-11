package LinkedList2;

public class intersection {
    public static Node inter(Node heada , Node headb){
        int lena=0;
        Node tempa=heada;
        while (tempa!=null){
            tempa=tempa.next;
            lena++;
        }
        int lenb=0;
        Node tempb=headb;
        while (tempb!=null){
            tempb=tempb.next;
            lenb++;
        }
       tempa=heada;
        tempb=headb;

        if (lena>lenb){
            for (int i=1;i<=lena-lenb;i++){
                tempa=tempa.next;
            }
        }
        else {
            for (int i=1;i<=lenb-lena;i++){
                tempb=tempb.next;
            }
        }
        while (tempa!=tempb){
            tempa=tempa.next;
            tempb=tempb.next;
        }
        return tempa;

    }
    public static void main(String[] args) {
        Node c = new Node(30);
        Node d = new Node(40);
        c.next = d;

        // First list: 10 -> 20 -> 30 -> 40
        Node a1 = new Node(10);
        Node b1 = new Node(20);
        a1.next = b1;
        b1.next = c;   // connect to common node

        // Second list: 50 -> 60 -> 30 -> 40
        Node a2 = new Node(50);
        Node b2 = new Node(60);
        a2.next = b2;
        b2.next = c;
        Node ans = inter(a1, a2);
        if (ans != null) {
            System.out.println(ans.val);
        } else {
            System.out.println("No intersection");
        }

    }
    }

