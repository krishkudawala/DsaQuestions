package Array;

public class lessthanN {
    public static void main(String[] args) {
        int [] arr={10,34,35,93,333,444,23};
        int n =arr.length;
        for (int i=0;i<n;i++){
            if (arr[i]<35){
                System.out.println(i+" ");
            }
        }

    }
}
