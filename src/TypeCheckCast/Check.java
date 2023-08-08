package TypeCheckCast;

public class Check {
    public static void main(String[] args) {
        Object obj1 = "Halo";
        Object obj2 = 123;

        // Memeriksa apakah obj1 adalah instance dari String
        if (obj1 instanceof String) {
            System.out.println("obj1 adalah instance dari String.");
        } else {
            System.out.println("obj1 bukan instance dari String.");
        }

        // Memeriksa apakah obj2 adalah instance dari Integer
        if (obj2 instanceof Integer) {
            System.out.println("obj2 adalah instance dari Integer.");
        } else {
            System.out.println("obj2 bukan instance dari Integer.");
        }
    }
}
