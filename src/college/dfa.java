package college;

public class dfa {
    public static void main(String[] args) {
        int [] arr={0,1,2,1,2,0,2,1,0};
        int n =arr.length;
        int lo=0 , mid=0,hi=n-1;
        while (mid<=hi){
            if (arr[mid]==0){
                int temp=arr[mid];
                arr[mid]=arr[lo];
                arr[lo]=temp;
                mid++; lo++;
            }
            else if (arr[mid]==1) mid++;
            else {
                int temp=arr[mid];
                arr[mid]=arr[hi];
                arr[hi]=temp;
                hi--;
            }
        }
        for (int ele :arr){
            System.out.print(ele+" ");
        }
    }
}
