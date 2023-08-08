package EqualsMethod;

public class MethodEquals2 {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "hello";
        String str3 = new String("hello");

        System.out.println(str1 == str2); // true, karena str1 dan str2 merujuk pada objek yang sama di memori
        System.out.println(str1 == str3); // false, karena str1 dan str3 merujuk pada objek yang berbeda di memori

        System.out.println(str1.equals(str2)); // true, karena isi dari str1 dan str2 adalah "hello"
        System.out.println(str1.equals(str3)); // true, karena isi dari str1 dan str3 adalah "hello"
    }
}
