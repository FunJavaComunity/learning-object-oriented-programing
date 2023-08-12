package Reflection;

import java.lang.reflect.*;

class Person {
    public String name = "Haekal";
    private int age = 19;

    public void introduce() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }

    private void doSomethingPrivate() {
        System.out.println("This is a private method.");
    }
}

public class exReflection {
    public static void main(String[] args) throws Exception {
        Class aClass = Person.class;

        Method[] declaredMethods = aClass.getDeclaredMethods();
        for (Method method : declaredMethods){
            System.out.println(method);
        }

        Method accesMethod = aClass.getDeclaredMethod("doSomethingPrivate");
        accesMethod.setAccessible(true);
        Person person = new Person();
        accesMethod.invoke(person);
    }
}
