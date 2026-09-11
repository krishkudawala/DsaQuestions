package Array;

public class dublicate {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,1,2,3,4,5};
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] != arr[j]) {
                    System.out.println(arr[i]);
                    flag = true;
                    break;
                }
            }
        }

        if (flag == true) System.out.println("Element found");
        else System.out.println("element not found");
    }
}