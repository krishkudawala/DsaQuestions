package recursion;

import java.util.Scanner;

public class Factorial {
    public static int fact(int n){
        if(n==1) return 1;
        return n*fact(n-1);
    }
    public static void main (String[] args) throws java.lang.Exception
    {
        int n=5;
        System.out.println(fact(n));
    }
}

