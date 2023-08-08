package Annotation;

import Inheritance.BangunDatar;

public class Hitung{
    int rumus1;
    int rumus2;

    public int Rumus1(){
        this.rumus1 = 0;
        return this.rumus1;
    }

    public int Rumus2(){
        this.rumus2 = 0;
        return this.rumus2;
    }
}

class Count extends Hitung{
    int a1;
    int a2;


    @Override//override merupakan anotasi bawaan java untuk menandai method yang mengoverride method superclass
    public int Rumus1() {
        return super.Rumus1();
    }

    @Override
    public int Rumus2() {
        return super.Rumus2();
    }

    public static void main(String[] args) {

    }
}