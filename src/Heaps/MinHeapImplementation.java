package Heaps;
class Minheap{
    int [] arr;
    int size;
    Minheap(int capacity){
        arr=new int[capacity];
        size=0;
    }
    public void add(int num) throws Exception{
        if (size==arr.length) throw new Exception("Heap is full");
        arr[size++]=num;
        upheapify(size-1);
    }
    public void upheapify(int ind){
        if (ind==0) return;
        int parant=(ind-1)/2;
        if (arr[ind]<arr[parant]){
            swap(ind,parant);
            upheapify(parant);
        }
    }
    public void swap(int i ,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public int size(){
        return size;
    }
    public int peek() throws Exception{
        if (size==0){
            throw new Exception("Heap is Empty");
        }
        return arr[0];
    }
    public int remove( )throws Exception{
        if (size==0) throw new Exception("Heap is Empty");
        int peek =arr[0];
        swap(0,size-1);
        size--;
        downheapify(0);
        return peek;
    }
    public void downheapify(int i){
        int lc=2*i+1 ,rc=2*i+2;
        if (i>=size) return;
        int minIdx=i;
        if (lc<size && arr[lc]<=arr[minIdx]) minIdx=lc;
        if (rc<size && arr[rc]<=arr[minIdx]) minIdx=rc;
        if (i==minIdx) return;
        swap(i,minIdx);
        downheapify(minIdx);
    }
}
public class MinHeapImplementation {
    public static void main(String[] args) throws Exception  {
        Minheap pq=new Minheap(10);
        System.out.println();
        pq.add(2);
        pq.add(3);
        System.out.println(pq.peek());
        pq.remove();
        System.out.println();
        pq.add(4);
        System.out.println(pq.peek()+" "+pq.peek());
    }
}
