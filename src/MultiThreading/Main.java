package MultiThreading;

public class Main {
    public static void main(String[] args) {
        Company co=new Company();
        Producer p=new Producer(co);
        Consumer c=new Consumer(co);
        p.start();
        c.start();
    }
}
