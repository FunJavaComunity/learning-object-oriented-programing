package AccessModifier.Access1;

public class ModProtected1 {
    protected String Protectedhi;
    protected void protectedMethod(String Hai) {
        // Implementasi
        this.Protectedhi = Hai;
    }
}

class ModProtected3 extends ModProtected1{
    protected void ProtectedMethod1(String Hi) {
        // Implementasi
        this.Protectedhi = Hi;
    }
}

class Display2{
    public static void main(String[] args) {
        ModProtected1 mp1 = new ModProtected1();
        mp1.protectedMethod("Halo2");
        ModProtected3 mp2 = new ModProtected3();
        mp2.ProtectedMethod1("Hai2");
        System.out.println(mp1.Protectedhi);
        System.out.println(mp2.Protectedhi);
    }
}
