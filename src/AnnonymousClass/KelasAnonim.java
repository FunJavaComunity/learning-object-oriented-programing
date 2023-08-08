package AnnonymousClass;

public interface KelasAnonim {
    void Halo();
    void Nama();
}

class Run{
    public static void main(String[] args) {
        //Annonym Class
        KelasAnonim ka = new KelasAnonim(){
          public void Halo(){
              System.out.println("Hi Semua!");
          }

          public void Nama(){
              System.out.println("Nama saya Fahri");
          }
        };

        ka.Halo();
        ka.Nama();
    }
}
