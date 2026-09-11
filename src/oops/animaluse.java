package oops;

public class animaluse {
    public static void main(String[] args) {
        AnimalInterface animalInterface;

        animalInterface=new Elephant();
        animalInterface.makesound();
        animalInterface.eat();

        animalInterface=new Lion();
        animalInterface.makesound();
        animalInterface.eat();

    }
}
