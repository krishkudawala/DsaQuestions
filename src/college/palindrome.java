package college;

public class palindrome {
    public static  int palindromee(String s ) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right))
                System.out.println("Srring in not palindrome");
                left++;
                right--;

            }
        System.out.println("String is palindrome");
       return 1;

    }
    public static void main(String[] args){
            String s = "abba";
            System.out.println(palindromee(s));


}}
