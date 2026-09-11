package oops;

public class additionMethodover {
    public int add(int a , int b){
        int c= a+b;
        return c;
    }
    public int add(int a , int b,int c){
        int d= a+b+c;
        return d;
    }
    public int add(int a , int b,int c,int d){
        int e= a+b+c+d;
        return e;
    }
    public double add(double i ,double j){
        double k =i+j;
        return k;
    }
    public String add(String s1, String s2){
        String s3=s1+s2;
        return s3;
    }
    public void add(String name ,int age){
        System.out.println("Name"+name);
        System.out.println("Age"+age);
    }
    public void add(int age , String name){
        System.out.println("Age"+age);
        System.out.println("Name"+name);
    }
}
