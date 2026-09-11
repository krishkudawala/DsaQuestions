package college;

public class multiadd {
    public static void main(String[] args) {
        int [][]arr ={{1,2,3,4},{5,6,7,8}};
        int [][]arr2={{1,2,3,4},{5,6,7,8}};
        int sum=0;
        int sum2=0;
        int m =arr.length;
        int n =arr[0].length;
        int m1 =arr2.length;
        int n2 =arr2[0].length;
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                sum+=arr[i][j];
            }
        }
        System.out.println(sum);
        for (int i=0;i<m1;i++){
            for (int j=0;j<n2;j++){
                sum+=arr[i][j];
            }
        }
        System.out.println(sum2);
    }
}
