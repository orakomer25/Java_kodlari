package Practice_day03;

import java.util.Scanner;

public class P01_ifElseStatements {
    public static void main(String[] args) {
        /*
        kullanıcıdan km olaral bir değer alalım
        çevirmek istediğiniz birimi sorun
        birim metre veya cm ise cevirin
        değilse hata mesajı verin.

         */
        Scanner scanner= new Scanner(System.in);
        System.out.println("mesafeyi KM olarak giriniz");
        Double mesafe = scanner.nextDouble();
        System.out.println("Çevirmek istediğiniz birimi giriniz METRE veya CM");
        String birim = scanner.next();
        char deger = birim.toUpperCase().charAt(0);

        if (deger=='M'){
            System.out.println(mesafe*1000+" METRE'dir");
        } else if (deger=='C') {
            System.out.println(mesafe*100000+" CM'dir");

        }else {
            System.out.println("Girilen Birim Hatalıdır.");
        }
    }
}
