package InterfaceInheritance;

public interface Cat {
    void Ras();
}

interface Cat2 extends  Cat{
    void Name();
}
class Kucing implements Cat2{
    public void Ras() {
        System.out.println("Persia");
    }

    public void Name() {
        System.out.println("Ciko");
    }

    public int Age(){
        return 4;
    }
}

class Run{
    public static void main(String[] args) {
        Kucing k = new Kucing();
        k.Name();
        k.Ras();
        System.out.println(k.Age() + " Years");
    }
}