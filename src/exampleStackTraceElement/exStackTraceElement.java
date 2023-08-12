package exampleStackTraceElement;

public class exStackTraceElement {
    public static void main(String[] args) {
        int pembilang = 10;
        int penyebut = 0;

        try {
            int hasil = pembilang / penyebut;
            System.out.println("Hasil: " + hasil);
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }
}
