package recursion;

import java.util.Scanner;

public class increasing {

    public static void print(int x,int n){
        if(x>n) return ;
        System.out.println(x);
        System.out.println();
        print(x+1,n);
    }
    public static void main (String[] args) throws java.lang.Exception
    {
        int n =5;
        //System.out.println(n);
        print(1,n);

    }
}
