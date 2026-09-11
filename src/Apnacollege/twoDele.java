package Apnacollege;

public class twoDele {
    public static void main(String[] args) {
        int [][] arr={{4,7,8},{8,8,7}};
        int n=arr.length;
        int m =arr[0].length;
        int count=0;
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if (arr[i][j]==7);
                {
                    count++;
                }
            }
        }
        System.out.println(count);
    }

}
