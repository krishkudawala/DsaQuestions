package basicSorting;

public class arrayissorted {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,6,7,12};
        int n =arr.length;
        boolean flag=true;
        for (int i=0;i<n-1;i++){
            if (arr[i]>arr[i+1]){
                flag = false;
                break;
            }
        }
        if (flag== true) System.out.println("sorted");
        else System.out.println("unsorted");
    }
}
