package Twodimarray;

public class foreach {
    public static void main(String[] args) {
        int [][] arr={{1,2,3,4},{5,6,7,8}};
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){

            }
        }
        for (int[] ele :arr){
            for ( int x : ele){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}
