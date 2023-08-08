package SuperConstructor;

class Hewan {
    String jenis;
    String ras;


    Hewan(String jenis) { // Constructor
        this.jenis = jenis;
    }
    Hewan(String jenis, String ras) { // Constructor
        this.jenis = jenis;
        this.ras = ras;
    }
}

class Kucing extends Hewan {
    String ras;

    Kucing(String jenis) { // Constructor
        super(jenis); // Memanggil konstruktor superclass dengan parameter
    }

    void info() {
        System.out.println("Jenis: " + jenis);
    }
}

class Tampil1{
    public static void main(String[] args) {
        Kucing kucing = new Kucing("Kucing");
        kucing.info();
    }
}
