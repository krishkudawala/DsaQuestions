package college;

public class index {
    public static void main(String[] args) {
        int[] arr = {4, 5 , 3,6 , 7 , 0, 1, 2};
        int n = arr.length;
        int x=4;
        for (int i=0;i<n;i++){
            if (arr[i]==x){
                System.out.println(i);
            }
            else System.out.println("-1");
            break;

        }
    }
}
