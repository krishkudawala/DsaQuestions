package college;

public class middlerowandcoloum {
    public static void print(int [][]arr,int n){
        int mid= n/2;

        for (int i=0;i<n;i++){
            System.out.println(arr[i][mid]+" ");
        }
        for (int j=0 ;j<n;j++){
            System.out.print(arr[mid][j]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4, 5}, {3, 4, 5, 6, 7}, {7, 6, 5, 4, 3}, {8, 7, 6, 5, 4}, {1, 2, 37, 8, 0}};
        int n =arr.length;
        print(arr,n);
        }
    }
