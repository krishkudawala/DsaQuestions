package college;

public class usecalculator {
    public static void main(String[] args) {
        calculator obj = new calculator();
        System.out.println("Addition of 10 and 10=>"+obj.add(10,20));
        System.out.println("Addition of 10 and 20 30=>"+obj.add(10,20,30));
        System.out.println("Addition of 12.2 and 13.3=>"+obj.add(12.2 ,13.3));
        System.out.println("Addition of 12.2 and 13.3 14.4=>"+obj.add(12.2,13.3,14.4));
        System.out.println("Concatenation hi or good=>"+obj.add("hi"," Good"));
        System.out.println();

    }
}
