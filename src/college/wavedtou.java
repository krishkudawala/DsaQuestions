package college;

public class wavedtou {
        public static void main(String[] args) {
            int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
            int m = arr.length;
            int n = arr[0].length;
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    // Print from bottom to top for even-indexed columns
                    for (int j = n - 1; j >= 0; j--) {
                        System.out.print(arr[i][j] + " ");
                    }
                } else {
                    // Print from top to bottom for odd-indexed columns
                    for (int j = 0; j < m; j++) {
                        System.out.print(arr[i][j] + " ");
                    }
                }
            }
        }}
            //    public static void main(String[] args) {
//        int [][] arr ={{1,2,3},{4,5,6},{7,8,9}};
//        int m =arr.length;
//        int n=arr[0].length;
//        for (int i=0 ; i<m;i++){
//           if (i%2==0){
//               for (int j=n-1;j>=0;j++){
//                   System.out.print(arr[i][j]+" ");
//               }
//           }
//           else for (int j=0;j<m;j++){
//               System.out.print(arr[i][j]+" ");
//           }
//        }
//    }
//}
