package InterfaceInheritance;

public interface Multiple {
    int Angka1(int angka1);
}

interface Multiple2 {
    int Angka2(int angka2);
}

interface Count extends Multiple, Multiple2 { //Berlaku juga untuk Implments
    void Operations(int a1, int a2);
}

class Output implements Count{

    public int Angka1(int angka1) {
        return angka1;
    }

    public int Angka2(int angka2) {
        return angka2;
    }

    public void Operations(int a1, int a2) {
        int hasil = Angka1(a1) * Angka2(a2);
        System.out.println("Hasil = " + hasil);
    }
}

class Display{
    public static void main(String[] args) {
        Output o = new Output();
        o.Operations(4, 2);
    }
}