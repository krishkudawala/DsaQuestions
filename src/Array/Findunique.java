package Array;

public class Findunique {
    public static void main(String[] args) {


    int[] arr = {4,8,4,7,8}; // 9 is the unique number

    int unique = 0;
    for (int num : arr) {
        unique ^= num;
    }
    System.out.println("Unique number is: " + unique);
}
}
