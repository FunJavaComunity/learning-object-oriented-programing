package variableHiding;

class Parent {
    int x = 10;

    public void display(){
        System.out.println("Superclass - x: " + x);
    }
}

class Child extends Parent{
//    int x = 20;

    public void display(){
        System.out.println("Subclass - x: " + x);
    }
}

public class Main {
    public static void main(String[] args) {
        Parent pr = new Parent();
        pr.display();

        Child ch = new Child();
        ch.display();
    }
}
