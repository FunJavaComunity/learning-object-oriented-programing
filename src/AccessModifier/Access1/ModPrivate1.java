package AccessModifier.Access1;

public class ModPrivate1 {
    private String Privatehi;
    private void PrivateMethod(String Hai) {
        // Implementasi
        this.Privatehi = Hai;
    }
}

class ModPrivate3 extends ModPrivate1{
    private void PrivateMethod1(String Hi) {
        // Implementasi
//        this.Privatehi = Hi;
    }
}

class Display1{
    public static void main(String[] args) {
        ModPrivate1 mp1 = new ModPrivate1();
//        mp1.PrivateMethod("Halo1");
        ModPrivate3 mp2 = new ModPrivate3();
//        mp2.PublicMethod1("Hai1");
//        System.out.println(mp1.Publichi);
//        System.out.println(mp2.Privatehi);
    }
}
