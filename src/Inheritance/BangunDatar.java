package Inheritance;

public class BangunDatar {
    double luas;
    double keliling;

    double luas(){
        this.luas = 0;
        return this.luas;
    }

    double keliling(){
        this.keliling =0;
        return this.keliling;
    }
}

class PersegiPanjang extends BangunDatar{
    double panjang;
    double lebar;

    double Panjang(double panjang){
        this.panjang = panjang;
        return this.panjang;
    }

    double Lebar(double lebar){
        this.lebar = lebar;
        return this.lebar;
    }

    public double luas(){
        this.luas = this.lebar * this.panjang; //l = P x L
        return this.luas;
    }

    public double keliling(){
        this.keliling = (this.lebar * 2) + (this.panjang * 2); //K = (p x 2) + (l x 2)
        return this.keliling;
    }

}

class Persegi extends BangunDatar {
    double sisi;

    double Sisi(double sisi) {
        this.sisi = sisi;
        return this.sisi;
    }

    double luas() {
        this.luas = this.sisi * this.sisi; // l = S x S
        return this.luas;
    }

    double keliling() {
        this.keliling =4 * this.sisi;// K = 4 x S
        return this.keliling;
    }
}

class Run{
    public static void main(String[] args) {
        PersegiPanjang pp = new PersegiPanjang();
        pp.Panjang(4);
        pp.Lebar(3);
        System.out.println("Luas Persegi Panjang : " + pp.luas());
        System.out.println("Keliling Persegi Panjang : " + pp.keliling());

        System.out.println();
        Persegi p = new Persegi();
        p.Sisi(6);
        System.out.println("Luas Persegi : " + p.luas());
        System.out.println("Keliling Persegi : " + p.keliling());
    }
}
