package college;

public class doubl {
    public static void main(String[] args) {
        int[]arr={2,3,4,5,3,5,6};
        int n=arr.length;
        int x=9;
        for (int i=0;i<n;i++){
            for (int j=1;j<n;j++){
                if (arr[i]+arr[j]==x){
                    System.out.println(arr[i]+" "+arr[j]);
                    break;
                }
            }
        }
    }
}
