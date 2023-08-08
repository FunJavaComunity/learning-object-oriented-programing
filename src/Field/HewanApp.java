package Field;

public class HewanApp {
    public static void main(String[] args) {
        Hewan kucing = new Hewan();

        kucing.NamaHewan = "Kucing"; //modifikasi field NamaHewan, untuk objek kucing
        kucing.JenisKelamin = "Perempuan"; //modifikasi field JenisKelamin, untuk objek kucing
        //kucing.JenisHewan = "karnivora"; //field JenisHewan tidak dapat dimodifikasi karena memakai sintaks final

        System.out.println(kucing.NamaHewan);
        System.out.println(kucing.JenisKelamin);
        System.out.println(kucing.JenisHewan);
    }
}
