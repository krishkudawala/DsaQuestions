package college;

public class unique {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,1,2,3};
        boolean flag = true;
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]!=arr[j]){
                    System.out.println(arr[i]);
                    flag=false;

                }
            }
        }
        if (flag==true) System.out.println("unique element");
        else System.out.println("Not unique in array");
    }
}
