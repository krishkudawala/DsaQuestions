package RecursionAssignment;

import java.util.Scanner;

public class stairsoneteothree {
    public static int stairs3(int n) {
        if (n == 0) return 1;
        if (n == 1) return 1;
        if (n == 2) return 2;
        if (n == 3) return 4;
        return stairs3(n-1)+stairs3(n-2)+stairs3(n-3);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(stairs3(n));
    }
}
