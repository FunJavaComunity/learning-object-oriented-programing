package EnumClass;

public enum Day {
    SENIN,
    SELASA,
    RABU,
    KAMIS,
    JUMAT,
    SABTU,
    MINGGU;

    public static void main(String[] args) {
        Day day = Day.SELASA;//Cara akses enum
        System.out.println(day);
    }
}
