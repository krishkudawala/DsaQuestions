package Zoo;
import org.animals.Elephant;
import org.animals.Lion;
import org.animals.Monkey;
public class VandalurZoo {
    public static void main(String[] args) {
        Elephant e = new Elephant();
        Lion l = new Lion();
        Monkey m = new Monkey();
        e.vegetrain();
        e.getsound();
        e.canClimbe();
        l.vegetrain();
        l.getsound();
        l.canClimbe();
        m.vegetrain();
        m.getsound();
        m.canClimbe();
        System.out.println("color=>"+e.s +" "+"age=>"+e.age+" "+ "weight=>"+e.weight);
    }

}
