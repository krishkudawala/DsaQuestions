package Array;

public class mergetwoarray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int[] b = {5, 6, 7, 8};
        int[] c = {a.length + b.length};
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                c[k] = a[i];
                i++;
                k++;
            } else {
                c[k] = b[j];
                j++;
                k++;
            }
        }
            if (i == a.length) {
                while (j < b.length) {
                    c[k] = b[j];
                    j++;
                    k++;
                }
            }
            if (j == b.length) {
                while (i < a.length) {
                    c[k] = a[i];
                    i++;
                    k++;
                }
            }
            for (int ele : c){
                System.out.print(ele+" ");
        }
    }
}


