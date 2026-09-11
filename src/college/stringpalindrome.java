package college;

public class stringpalindrome {
    public static void main(String[] args) {
        String s = "abba";
        int n = s.length();
        int lo = 0;
        int hi = n - 1;
        boolean flag = false;
        while (lo <= hi) {
            if (s.charAt(lo) == s.charAt(hi)) {
                lo++;
                hi--;
                flag = true;
            } else if (s.charAt(lo) != s.charAt(hi)){

                lo++;
                hi--;
                flag=false;
            }
        }

        if (flag == true) System.out.println("String is palindrome");
       else if (flag==false)System.out.println("String is not palindrome");
    }
}
