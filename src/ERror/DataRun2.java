package ERror;

public class DataRun2 {
    public void ConnectToData(String name, String password){
        if(name == null || password == null){
            throw new DataError("Gagal menghubungkan ke database");
        }
    }

    public static void main(String[] args) {
        DataRun2 run2 = new DataRun2();
        //Tidak disarankan
        try{
            run2.ConnectToData("Fahri", null);
            System.out.println("Berhasil terhubung ke database");
        }catch(DataError error){
            System.out.println("Eror" + error.getMessage());
        }
    }
}
