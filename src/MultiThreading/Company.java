package MultiThreading;

public class Company {
    int n;
   synchronized public void produce_Item(int n){
        this.n=n;
        System.out.println("Produced : "+n);

    }
   synchronized public int consume_Item(){
        System.out.println("Consume :"+ n);
        return n;

    }
}
