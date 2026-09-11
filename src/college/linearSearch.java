package college;

public class linearSearch {
    public static void main(String[] args) {
        int [] arr ={1,2,3,4,5,6,7,8,9};
        int find=15;
        int n =arr.length;
        boolean flag = false;
        for (int i=0;i<n;i++){
            if (arr[i]==find){
                flag=true;
                break;
            }
        }
        if (flag==true) System.out.println("Element found");
        else System.out.println("Not found");
    }
}
