    package Trees;

    public class PathSum3 {
        public static int hepler(Node root ,long sum){
            if (root==null) return 0;
            int count=0;
           
            count+=hepler(root.left,sum-root.val)+hepler(root.right,sum-root.val);
            return count;
        }
        public static int pathsum(Node root,int sum){
            if (root==null) return 0;

            return hepler(root,sum)+pathsum(root.left,sum)+pathsum(root.right,sum);
        }
        public static void main(String[] args) {
            Node a=new Node(5);
            Node b=new Node(4);
            Node c=new Node(8);
            Node d=new Node(11);
            Node e=new Node(13);
            Node f=new Node(4);
            Node g=new Node(7);
            Node h=new Node(2);
            Node i=new Node(5);
            Node j=new Node(1);

            a.left=b; a.right=c;
            b.left=d; c.left=e;
            c.right=f; d.left=g;
            d.right=h; f.left=i;
            f.right=j;
            int target=8;
            System.out.println(pathsum(a,target));
        }
    }
