package Queue;

public class DequeImplementationUsingDll {
    static class Node{
        int val;
        Node next;
        Node prev;
        Node (int val){
            this.val=val;
        }
    }
    public static class Deque{
        Node front;
        Node rear;
        int size;

        Deque(){
            front=rear=null;
            size=0;
        }
        boolean isEmpty(){
            if (size==0){
                return true;
            }
            return false;
        }
        int size(){
            return size;
        }
        void insertFront(int val){
            Node newNode=new Node(val);
            if (front==null){
                rear=front=newNode;
            }
            else {
                newNode.next=front;
                front.prev=newNode;
                front=newNode;
            }
            size++;
        }
        void insertRear(int val){
            Node newNode=new Node(val);
            if (rear==null){
                front=rear=newNode;

            }
            else {
                newNode.prev=rear;
                rear.next=newNode;
                rear=newNode;
            }
            size++;
        }
        void deleteFront(){
            if (size==0){
                System.out.println("underflow");
            }
            else {
                Node temp=front;
                front=front.next;

                if (front==null){
                    rear=null;
                }
                else {
                    front.prev=null;
                }
                size--;
            }
        }
        void deleteRear(){
            if (size==0){
                System.out.println("queue is Empty");
            }
            else {
                Node temp=rear;
                rear =rear.prev;
                if (rear==null){
                    front=null;
                }
                else {
                    rear.next=null;
                }
                size--;
            }
        }
        int getFront(){
            if (size==0){
                System.out.println("Underflow");
                return -1;
            }
            return front.val;
        }
        int getRear(){
            if (size==0){
                System.out.println("Underflow");
                return -1;
            }
            return rear.val;
        }
    }
    public static void main(String[] args) {
        Deque deque=new Deque();
        System.out.println("inser 5 AT rearEnd");
        deque.insertRear(5);
        System.out.println("inset 10");
        deque.insertRear(10);
        System.out.println(deque.getRear());

    }
}
