package college;

public class arrayimpusinfqueue {
    public static class queue{
        int f=-1;
        int r=-1;
        int size=0;
        int [] arr=new int[5];

        public void add(int val){
            if (r==arr.length-1){
                System.out.println("Queue is full");
                return;
            }
            if (r==-1 && f==-1){
                f=r=0;
                arr[r]=val;
            }
            else {
                arr[++r]=val;
            }
            size++;
        }
        public int remove(){
            if (size==0){
                System.out.println("Queue is empty");
                return -1;
            }
            int val=arr[f];
            size--;
            return val;
        }

        public int peek(){
            if (size==0){
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[f];
        }
        public boolean isEmpty(){
            if (size==0){
                return true;
            }
            else return false;
        }
        public void Display(){
            if (size==0){
                System.out.println("Queue is empty");
            }
            else {
                for (int i=f;i<=r;i++){
                    System.out.print (arr[i]+" ");
                }
            }
            System.out.println();
        }
        public int size(){
            return size;
        }
    }
    public static void main(String[] args) {
        queue queue=new queue();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        queue.Display();
        System.out.println(queue.remove());
        System.out.println(queue.size());
        System.out.println(queue.peek ());

    }
}
