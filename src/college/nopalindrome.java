package college;

public class nopalindrome {
    public static void main(String[] args) {
        boolean flag = false;
        String s = "madam";
        int n = s.length();
        int left = 0;
        int right = n - 1;
        while (left<right){
            if (s.charAt(left) != s.charAt(right)) {
                flag=true;
            }
            left++;
            right--;
        }
        if (flag=true) System.out.println("No is palindrome");
        else System.out.println("No is not palindrome");
    }
}