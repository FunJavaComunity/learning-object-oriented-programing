package EqualsMethod;

public class MethodEquals3 {
    public static void main(String[] args) {
        String Hi = new String("Hai");
        String Hi2 = new String("Hai");

        System.out.println(Hi == Hi2);//true
        System.out.println(Hi.equals(Hi2));//false
        //Untuk membandingkan kedua objek gunakan Method equals
    }
}
