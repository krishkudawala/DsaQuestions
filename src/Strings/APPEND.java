package Strings;

public class APPEND {
    public static void main(String[] args) {
        StringBuilder s=new StringBuilder("sbc");
        System.out.println(s);
        s.append(2);
        System.out.println(s);
        int []arr={1,2,3,4};
        s.append(arr);
        System.out.println(s); // does not work

        s.reverse();
        System.out.println(s);
    }
}
