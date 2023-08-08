package Constructor_Overloading;

    public class Mahasiswa {
    String NamaMahasiswa;
    String JurusanMahasiswa;

    Mahasiswa(String Nama, String JenisKelamin){
        NamaMahasiswa = Nama;
        JurusanMahasiswa = JenisKelamin;
    }
    Mahasiswa(String Nama){ //constructor kedua memanggil constructor pertama
        NamaMahasiswa = Nama;
    }
    Mahasiswa(){ //constructor ketiga memanggil constructor pertama

    }

    public static void main(String[] args) {
        Mahasiswa fahri = new Mahasiswa("Fahri", "Laki-Laki");
        Mahasiswa doni = new Mahasiswa("Doni");
        Mahasiswa kosong = new Mahasiswa();

        System.out.println("Nama saya " + fahri.NamaMahasiswa + " Dengan jenis kelamin " + fahri.JurusanMahasiswa);
        System.out.println("Nama saya " + doni.NamaMahasiswa + " Dengan jenis kelamin " + doni.JurusanMahasiswa);
        System.out.println("Nama saya " + kosong.NamaMahasiswa + " Dengan jenis kelamin " + kosong.JurusanMahasiswa);

    }
}
