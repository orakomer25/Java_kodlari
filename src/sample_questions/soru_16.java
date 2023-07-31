package sample_questions;

import java.util.Scanner;

public class soru_16 {
    public static void main(String[] args) {
        /*
        Soru 16-)
Kullanıcıdan 2 isim/kelime alın: isim1 ve isim2
-> isim1 çift sayıda karaktere sahipse, ikinci kelimeyi ilk kelimenin ortasına ekleyin
-> ilk sözcükte tek sayılar varsa,  'isim2, isim1'e eklenemez" ifadesini yazdırın.
Ipucu: If Else ve String Manipulation konusunu hatırlayalım!  Substring,concat,lengt...
Örn:
	 isim1= masa
         isim2= ali
	 Konsol => maalisa
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen 1. kelimeyi giriniz");
        String kelime1 = scanner.next();
        System.out.println("lütfen 2. kelimeyi giriniz");
        String kelime2 = scanner.next();
        int uzunlukKelime1=kelime1.length();
        int uzunlukKelime2=kelime2.length();
        if (uzunlukKelime1%2==0){
            System.out.println(kelime1.substring(0,(uzunlukKelime1)/2)+kelime2+kelime1.substring((uzunlukKelime1)/2));



        }else {
            System.out.println("kelime2 kelime1 e eklenemez.");
        }
    }
}
