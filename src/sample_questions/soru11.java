package sample_questions;

import java.util.Scanner;

public class soru11 {
    public static void main(String[] args) {
        /*
        Soru 11-) Kullanıcıya Adını, Soyadını ve kredi kartı numaralarını sorup bunları özel forma dönüştürün.
                 Ad ve soyadın baş harfleri büyük olmalıdır
                 Kredi kartı numarasını kontrol edin, 16 hane yoksa "Geçersiz kredi kartı numarası" yazdırın.
                 Kredi Kartı 16 Hane ise aşagıda belirtilen şekilde çıktı alın.

Ipucu: IF ile çözebilirsiniz.
Giriş :
		 > Gandalf Grey 563245879632
Çıktı :
		 > İsim : G****** G***
		 > CCN : **** **** 9632
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("ADINIZ :");
        String name = scanner.nextLine();
        System.out.println();
        System.out.print("SOYADINIZ :");
        String surname = scanner.nextLine();
        System.out.println();
        System.out.println();
        System.out.print("KREDİ KARTI NUMARASI(16 haneli) :");
        String ccn = scanner.nextLine();
        System.out.println();
        ccn=ccn.replaceAll("\\D","");
        if (ccn.length() != 16) {
            System.out.println("GEÇERSİZ KART NUMARASI");
        }else {
            String isim = name;
            String soyisim = surname;
            isim = isim.toUpperCase().charAt(0) + isim.substring(1).replaceAll("\\w", "*");
            soyisim = soyisim.toUpperCase().charAt(0) + soyisim.substring(1).replaceAll("\\w", "*");
            String kredikartino = ccn.substring(0, 4).replaceAll("\\d", "*") + " " + ccn.substring(4, 8).replaceAll("\\d", "*") + " " + ccn.substring(8, 12).replaceAll("\\d", "*") + " " + ccn.substring(12);
            System.out.println("ISIM: " + isim + " " + soyisim);
            System.out.println("CCN :" + kredikartino);
        }
    }
}
