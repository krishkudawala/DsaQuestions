package oops;

public class useadition {
    public static void main(String[] args) {
        additionMethodover obj=new additionMethodover();
        System.out.println("Addition of 10 and 20=>"+obj.add(10,20));
        System.out.println("Addition of 12.2 and 14.4=>"+obj.add(12.2,14.4));
        System.out.println("Concatenation of good and morning=>"+obj.add("Good","Morning"));
        System.out.println("Addition of 10+20+30=>"+obj.add(10,20,30));
        System.out.println("Addition of 10+20+30+40=>"+obj.add(10,20,30,40));
        obj.add("krish",12);
        obj.add(12,"krish"); 
    }
}
