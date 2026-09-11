package college;

public class QueueLinkedImp {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }
    public static class queueimp{
        Node head=null;
        Node tail=null;
        int size=0;

        public void add(int x){
            Node temp=new Node(x);
            if (size==0){
                head=tail=temp;
            }
            else {
                tail.next=temp;
                tail=temp;
            }
            size++;
        }
        public int  peek(){
            if (size==0){
                System.out.println("Queue is Empty");
                return -1;
            }
            return head.val;
        }
        public int remove(){
            if (size==0){
                System.out.println("Queue is Empty");
                return -1;
            }
            int x=head.val;
            head=head.next;
            size--;
            return x;
        }
        public boolean isEmpty(){
            if (size==0){
                return true;
            }
            else return false;
        }
        public void display(){
            Node temp=head;
            while (temp!=null){
                System.out.print(temp.val+" ");
                    temp=temp.next;
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        queueimp queueimp=new queueimp();


    }
}
