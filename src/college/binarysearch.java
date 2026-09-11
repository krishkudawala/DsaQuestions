package college;

public class binarysearch {
    public static void main(String[] args) {
//        int [] arr ={12,22,33,22,4,5};
//        int n = arr.length;
//        int target = 22;
//        boolean flag =false;
//        int lo =0 , hi=n-1;
//        while (lo<=hi){
//            int mid = (lo+hi)/ 2;
//            if (arr[mid]==target){
//                flag=true;
//                break;
//            }
//            else if(arr[mid]<target) hi=mid-1;
//            else if(arr[mid]>target) lo=mid+1;
//        }
//        if (flag==true) System.out.println("Element found");
//        else System.out.println("Not found");
        int []arr={22,33,11,44,222,44};
        int n=arr.length;
        int lo =0 , hi=n-1;
        int target = 2228;
        boolean flag=false;
        while (lo<=hi){
            int mid=(lo+hi)/2;
            if (arr[mid]==target) {
                flag =true;
                break;

            }
            else if(arr[mid]>target) hi=mid-1;
            else if(arr[mid]<target) lo=mid+1;
        }
        if (flag==true) System.out.println("Element found");
        else System.out.println("Element not found");
//
    }
}
