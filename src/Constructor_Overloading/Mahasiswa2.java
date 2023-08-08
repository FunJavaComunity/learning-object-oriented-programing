package Constructor_Overloading;

public class Mahasiswa2 {
    String NamaMahasiswa;
    String JurusanMahasiswa;

    Mahasiswa2(String Nama, String Jurusan){
        NamaMahasiswa = Nama;
        JurusanMahasiswa = Jurusan;
    }
    Mahasiswa2(String Nama){
        this(Nama, null);
    }
    Mahasiswa2(){
        this(null);
    }

    public static void main(String[] args) {
        Mahasiswa2 fahri = new Mahasiswa2("Fahri", "Teknik Sipil");
        Mahasiswa2 doni = new Mahasiswa2("Doni");
        Mahasiswa2 kosong = new Mahasiswa2();

        System.out.println("Nama saya " + fahri.NamaMahasiswa + " dari Jurusan " + fahri.JurusanMahasiswa);
        System.out.println("Nama saya " + doni.NamaMahasiswa + " dari Jurusan " + doni.JurusanMahasiswa);
        System.out.println("Nama saya " + kosong.NamaMahasiswa + " dari Jurusan " + kosong.JurusanMahasiswa);

    }
}
