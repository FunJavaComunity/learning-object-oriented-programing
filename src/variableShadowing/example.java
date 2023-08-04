package variableShadowing;

public class example {
    String name;
    String address;

    example(String nama, String alamat){
        name = nama;
        address = alamat;
    }

    public static void main(String[] args) {
        example ex = new example("Haekal", "Pasuruan");

        System.out.println(ex.name);
        System.out.println(ex.address);
    }
}
