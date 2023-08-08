package Inheritance;

//Superclass
public class Induk {
    String warna;
    String jenisbulu;
    String kucing;

    void Kucing(String Warna, String JenisBulu, String Kucing){
        kucing = Kucing;
        warna = Warna;
        jenisbulu = JenisBulu;

        System.out.println(Kucing + "Kucing dengan warna " + warna + " memiliki bulu yang " + this.jenisbulu);
    }
}

//subclass
class Anak extends Induk{

}
 class Tampil{
     public static void main(String[] args) {
         //Menampilkan ciri-ciri induk kucing
         Induk i = new Induk();
         i.Kucing("Putih, Hitam, Coklat", "Lebat", "Induk ");

         System.out.println();
         //Menampilkan ciri-ciri anak kucing
         Anak a = new Anak();
         a.Kucing("Putih", "Lebat", "Anak ");
     }
 }