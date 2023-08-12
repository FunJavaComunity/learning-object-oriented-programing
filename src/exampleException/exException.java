package exampleException;

public class exException {
    public static void main(String[] args) {
        int pembilang = 10;
        int penyebut = 0;

        try {
            int hasil = pembilang / penyebut;
            System.out.println("Hasil: " + hasil);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
