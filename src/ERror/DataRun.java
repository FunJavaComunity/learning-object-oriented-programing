package ERror;

public class DataRun {

    public void ConnectToData(String name, String password){
        if(name == null || password == null){
            throw new DataError("Gagal menghubungkan ke database");
        }
    }

    public static void main(String[] args) {
        DataRun run = new DataRun();
        run.ConnectToData(null, "wkwk");
        System.out.println("Berhasil terhubung ke database");
    }
}
