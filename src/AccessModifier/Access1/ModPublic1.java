package AccessModifier.Access1;

public class ModPublic1 {
    public String Publichi;
    public void publicMethod(String Hai) {
        // Implementasi
        this.Publichi = Hai;
    }
}

class Modpublic3 extends ModPublic1{
    public void PublicMethod1(String Hi) {
        // Implementasi
        this.Publichi = Hi;
    }
}

class Display3 {
    public static void main(String[] args) {
        ModPublic1 mp1 = new ModPublic1();
        mp1.publicMethod("Halo3");
        Modpublic3 mp2 = new Modpublic3();
        mp2.PublicMethod1("Hai3");
        System.out.println(mp1.Publichi);
        System.out.println(mp2.Publichi);
    }
}
