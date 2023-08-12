package defaultMethod;

public interface Animal {
    void makeSound();

    default void showInfo(){
        System.out.println("This is an animal.");
    }
}
