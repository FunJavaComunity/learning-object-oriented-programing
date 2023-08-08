package AbstractMethod;

public abstract class Mobil {
    public String brand;
    public abstract void tampil(String Brand, String Nama);
}

class NamaMobil extends Mobil{
    public String nama;
    public void tampil(String Brand, String Nama) {
        this.brand = Brand;
        this.nama = Nama;
    }
}

class Display{
    public static void main(String[] args) {
        NamaMobil nm = new NamaMobil();
        nm.tampil("Honda", "Brio");
        System.out.println(nm.brand);
        System.out.println(nm.nama);
    }
}