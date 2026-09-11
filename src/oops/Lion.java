package oops;

public class Lion implements AnimalInterface{
    public void makesound(){
        System.out.println("Lion make sound Roars");
    }

    @Override
    public void eat() {
        System.out.println("Lion eats fleash");
    }
}
