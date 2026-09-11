package Trees;

public class DiameterOfBinaryTree {
    public static int diameter(Node root , int [] mydia){
        if (root==null) return 0;
        int leftlevel=diameter(root.left,mydia);
        int rigthlevel=diameter(root.right,mydia);
        int dia=leftlevel+rigthlevel;
        mydia[0]=Math.max(leftlevel,rigthlevel);
        return 1+Math .max(leftlevel,rigthlevel);
    }
    public static void main(String[] args) {
        int [] maxdia={0};
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;

        diameter(a,maxdia);
        System.out.println(maxdia[0]);
    }
}
