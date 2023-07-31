package day13_stringManiplations_forloop;

import java.util.Scanner;

public class soru5 {
    public static void main(String[] args) {
        /*
        Soru 5 : Kullanicidan isim ve soyismini ayri ayri alin.
- ismi daha uzun ise, isim ve soyismi ilk harf buyuk kalanlar kucuk seklinde
yazdirin
- soyisim daha uzun ise ismi ilk harf buyuk digerleri kucuk, soyismi buyuk
harflerle yazdirin
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen isminizi giriniz");
        String isim = scanner.nextLine();
        System.out.println("lütfen soyisminizi giriniz");
        String soyisim = scanner.nextLine();
        int isimUzunluk = isim.length();
        int soyIsimUzunluk = soyisim.length();
        if (isimUzunluk > soyIsimUzunluk) {
            System.out.println(isim.substring(0, 1).toUpperCase() + isim.substring(1).toLowerCase() + " "
                    + soyisim.substring(0, 1).toUpperCase() + soyisim.substring(1).toLowerCase());
        } else if (isimUzunluk<soyIsimUzunluk) {
            System.out.println(isim.substring(0, 1).toUpperCase() + isim.substring(1).toLowerCase()+" "+soyisim.toUpperCase());

        }
    }
}
