package defaultMethod;

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.makeSound();
        myDog.showInfo();

        Cat myCat = new Cat();
        myCat.makeSound();
        myCat.showInfo();
    }
}
