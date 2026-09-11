package oops;

public class useanimal {
    public static void main(String[] args) {
        Animal a;

        a = new Dog();
        a.makeSound();   // Output: Dog barks

        a = new Cat();
        a.makeSound();   // Output: Cat meows
    }
}

