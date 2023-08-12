package defaultMethod;

public class Cat implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow meow!");
    }

    @Override
    public void showInfo() {
        System.out.println("This is a cat.");
    }
}
