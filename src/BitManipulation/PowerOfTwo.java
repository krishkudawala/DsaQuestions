package BitManipulation;

public class PowerOfTwo {
    public static boolean isPowerOfTwo(int n) {
       return (n<0) ? false : ((n & (n-1))==0);
    }
    public static void main(String[] args) {
        int n=1024 ;
        System.out.println(isPowerOfTwo(n));
    }
}
