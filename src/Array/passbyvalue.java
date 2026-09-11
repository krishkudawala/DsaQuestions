package Array;

public class passbyvalue {
    public static void main(String[] args) {
       // int x = 5;
        int []x={5};
        System.out.println(x[0]);
        change(x[0]);
        System.out.println(x[0]);
//        System.out.println(x);
//        change(x);
//        System.out.println(x);
    }

    public static void change(int x) {
        x=10;
    }


}
