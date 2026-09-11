package Array;

public class firstnonrepeat {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,1};
        int n =arr.length;
        boolean flag=true;
        for (int i=0;i<n;i++){
            for (int j=1;j<n;j++){
                if (arr[i]==arr[j]) {
                    System.out.println(arr[i]);
                    flag=false;
                    break;
                }
            }
        }
        if (flag==true) System.out.println("ele found");
        else System.out.println("Element not found");
    }
}
