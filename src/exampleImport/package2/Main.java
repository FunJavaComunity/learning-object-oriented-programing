package exampleImport.package2;

import exampleImport.package1.*;

public class Main {
    public static void main(String[] args) {
        myClass1 mc1 = new myClass1();
        mc1.method1();

        myClass2 mc2 = new myClass2();
        mc2.method2();
    }
}
