package oops;

public class passbyvalue {
    public static void main(String[] args) {
        int x =10 ,y=20;
        System.out.println("After increment=> "+x+ " " +y);
        increment(x,y);
        System.out.println("before increment=> "+x+ " " +y);

    }
    public static void increment(int x , int y){
        x=x+5;
        y=y+5;
    }
}
