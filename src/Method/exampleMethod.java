package Method;

public class exampleMethod {
    public void sapa() {
        System.out.println("Halo! Selamat datang di program Java!");
    }

    public void sapaUser(String nama) {
        System.out.println("Halo, " + nama + "! Selamat datang di program Java!");
    }

    public int tambah(int angka1, int angka2) {
        int hasil = angka1 + angka2;
        return hasil;
    }

    public static void main(String[] args) {
        exampleMethod em = new exampleMethod();
        em.sapa();
        em.sapaUser("Haekal");
        System.out.println(em.tambah(5, 10));
    }
}
