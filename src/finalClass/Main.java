package finalClass;

final class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound.");
    }
}

/* Kode ini akan menghasilkan kesalahan kompilasi karena mencoba mewarisi dari final class
class Cat extends Animal{
    @Override
    public void makeSound() {
        System.out.println("Meow meow!");
    }
}
*/

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound();

//        Cat cat = new Cat();
//        cat.makeSound();
    }
}
