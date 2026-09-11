package college;

public class doublet {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,20,30,33};
        int n =arr.length;
        int x = 10;
        // solution
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                if (arr[i]+arr[j]==x){

                    System.out.println(arr[i]+" "+arr[j]);
                    System.out.println(x);

                }
            }

        }
    }
}
