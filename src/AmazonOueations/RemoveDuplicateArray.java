package AmazonOueations;

public class RemoveDuplicateArray {
    public static void main(String[] args) {
        int[] arr={0,1,1,1,2,2,3};
        int i=0;
        for (int j=1;j<arr.length;j++){
            if (arr[i]<arr[j]){
                int temp=arr[i+1];
                arr[i+1]=arr[j];
                arr[j]=temp;
                i++;
            }
        }
        for (int k=0;k<=i;k++){
            System.out.println(i+1+ " ");
          break;
//            System.out.println(arr[k]);
        }
    }
}
