package Arraysassigment;

public class Duplicate {
    public static void main(String[] args) {
        int [] arr ={1,2,3,4,4,3,2,2};
        int n= arr.length;

        boolean flag=false;
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                if (arr[i]==arr[j]){
                    flag=true;
                }
            }
        }
        if (flag==true) System.out.println("Found");
        else System.out.println("Not Found");

    }
}
