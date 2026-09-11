package oops;

import java.util.Scanner;

public class Account {
    private int accid;
    private  String name;
    private double bal;
    private static double rateofint;
    static {
        System.out.println("enter rate of interest");
        Scanner sc= new Scanner(System.in);
        rateofint= sc.nextDouble();

    }
    public Account(int id , String n , double b){
        accid=id;
        name=n;
        bal=b;
        System.out.println("constructor called");
    }
    public void shpwAccount(){
        System.out.println("Account"+accid);
        System.out.println("Name"+name);
        System.out.println("Balance"+bal);
    }
}
