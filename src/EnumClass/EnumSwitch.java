package EnumClass;

public class EnumSwitch {
    //Enum juga bisa kita buat di dalam class
    enum Hari{
        SENIN,
        SELASA,
        RABU,
        KAMIS,
        JUMAT,
        SABTU,
        MINGGU;
    }

    public static void main(String[] args) {
        Hari hari = Hari.KAMIS;

        //penggunaan enum dalam konteks switch case
        switch (hari) {
            case SENIN:
                System.out.println("Hari ini hari senin");
                break;
            case SELASA:
                System.out.println("Hari ini hari selasa");
                break;
            case RABU:
                System.out.println("Hari ini hari rabu");
                break;
            case KAMIS:
                System.out.println("Hari ini hari kamis");
                break;
            case JUMAT:
                System.out.println("Hari ini hari jumat");
                break;
            case SABTU:
                System.out.println("Hari ini hari sabtu");
                break;
            case MINGGU:
                System.out.println("Hari ini hari minggu");
                break;
            default:
                System.out.println("data yang anda masukkan salah");
        }
    }
}
