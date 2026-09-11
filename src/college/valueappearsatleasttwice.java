package college;

public class valueappearsatleasttwice {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        int n = arr.length;
        boolean flag = false;
        for (int i = 0; i < n-1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    flag = true;
                    break;
                }
            }
        }
            if (flag == true) System.out.println("true");
            else System.out.println("false");
        }
    }
