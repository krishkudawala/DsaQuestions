package college;

import java.util.Scanner;

public class oddposition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length();
        for (int i = 0; i < n; i++) {
            if (n % 2 != 0) {
                System.out.print(         "#");
            } else System.out.println(str);
        }
    }
}

