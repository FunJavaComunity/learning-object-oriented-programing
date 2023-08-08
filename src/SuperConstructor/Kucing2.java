package SuperConstructor;

public class Kucing2 extends Hewan{

    Kucing2(String jenis, String ras) { // Constructor
        super(jenis, ras); // Memanggil konstruktor superclass dengan parameter
    }

    void info() {
        System.out.println("Jenis: " + jenis);
        System.out.println("Ras: " + ras);
    }
}

class Tampil2{
    public static void main(String[] args) {
        Kucing2 kucing2 = new Kucing2("Kucing", "Persia");
        kucing2.info();
    }
}
