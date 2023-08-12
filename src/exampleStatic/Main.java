package exampleStatic;

import static exampleStatic.exStaticVariable.*;
import static exampleStatic.exStaticMethod.sayHello;
import static exampleStatic.exStaticInnerClass.Inner.printMessage;
import static exampleStatic.exStaticBlock.configuration;

public class Main {
    public static void main(String[] args) {
        // mengakses static variabel
        System.out.println(PI);
        System.out.println(age);

        // mengakses static method
        sayHello("Haekal");

        // mengakses static inner class
        printMessage();

        // mengakses static block
        System.out.println(configuration);
    }
}
