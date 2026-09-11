package Queue;

public class CircularQueueArray {
    public static class cqa{
        int front=-1;
        int rear=-1;
        int size=0;
        int [] arr=new int[5];

        public  void add(int val){
            if(size==arr.length){
                System.out.println("Array is full");
                return;
            }
            else if (size==0){
                front=rear=0;
                arr[0]=val;
            }
            else if (rear==arr.length-1){
                rear=0;
                arr[0]=val;
            }
            size++;
        }
        public int remove() {
            if (size == 0) {
                System.out.println("Queue is Empty");
                return -1;
            }
            else {
                int val = arr[front];
                if (front==arr.length-1) front=0;
                else front++;
                size--;
                return val;
            }
        }
        public int peek(){
            if(size==0){
                System.out.println("Queue is Empty");
                return -1;
            }
            else return arr[front];
        }
        public void display(){
            if (size==0){
                System.out.println("Queue is Empty");
                return;
            }
            else if (front<=rear){
                for (int i=0;i<=rear;i++){
                    System.out.print(arr[i]+" ");
                }
            }
            else {
                for (int i=front;i<arr.length;i++){
                    System.out.print(arr[i]+" ");
                }
                for (int i=0;i<=rear;i++){
                    System.out.print(arr[i]+" ");
                }
            }
            System.out.println();
        }
        public boolean isEmpty(){
            if (size==0) return true;
            else return false;
        }

    }
    public static void main(String[] args) {
        cqa cqa=new cqa();
        cqa.display();
        cqa.add(1);
        cqa.add(2);
        cqa.add(3);
        cqa.add(4);

       cqa.display();
        System.out.println(cqa.isEmpty());
        System.out.println(cqa.remove());
    }
}
