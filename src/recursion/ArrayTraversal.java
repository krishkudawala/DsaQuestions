package recursion;

public class ArrayTraversal {
        public static void print(int i , int [] arr){
            if(i==arr.length) return;
            System.out.print(i+" ");
            print(i+1,arr);
        }
        public static void main(String[] args) {
            int [] arr={1,2,3,4,5};
            print(1,arr);
        }
    }