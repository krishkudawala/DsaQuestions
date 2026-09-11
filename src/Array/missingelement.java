package Array;

public class missingelement {
    public static void main(String[] args) {
        int []arr={1,2,4,5,6,7};
        int target=3;
        boolean flag=false;
        for (int i=0;i<arr.length;i++){
            if (arr[i]==target){
                System.out.println(arr[i]);
            }
        }
    }
}
