package methodOverriding;
public class Main {
    public static void main(String[] args) {
        Hewan hewan1 = new Kucing();
        Hewan hewan2 = new Singa();

        hewan1.suara();
        hewan2.suara();
    }
}
