package AccessModifier.Access1;

public class ModDefault1 {
    String Defaulthi;
    void DefaultMethod(String Hai) {
        // Implementasi
        this.Defaulthi = Hai;
    }
}

class ModDefault3 extends ModDefault1{
    void DefaultMethod1(String Hi) {
        // Implementasi
        this.Defaulthi = Hi;
    }
}

class Display{
    public static void main(String[] args) {
        ModDefault1 m1 = new ModDefault1();
        m1.DefaultMethod("Halo");
        ModDefault3 m2 = new ModDefault3();
        m2.DefaultMethod1("Hai");
        System.out.println(m1.Defaulthi);
        System.out.println(m2.Defaulthi);
    }
}
