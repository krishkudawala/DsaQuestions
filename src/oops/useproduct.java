package oops;

public class useproduct {
    public static void main(String[] args) {
        product p=new product();
        p.setId(101);
        p.setName("krish");
        p.setPrice(10101.1);
        System.out.println("Your id"+p.getId());
        System.out.println("Your name"+p.getName());
        System.out.println("Your name"+p.getPrice());
    }
}
