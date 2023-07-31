package sample_questions;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class soru_22 {
    public static void main(String[] args) {


    /*
        Soru 22-)
        Kullanıcıdan 2 tamsayı girmesini isteyin, ardından GCD (En Büyük Ortak Bölen) ve LCM'yi bulun (En Küçük Ortak Kat)
        Giriş :
        30 ve 40

        Beklenen Çıktı:
        30 ve 40 için EBOB= 10
        30 ve 40 için EKOK= 120
        ipucu:
        Loopları kullanarak çözebiliriz. İki sayının EKOK'u sayıların çarpımının sayıların EBOB'una bölünerek bulunabilir.
     */
        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen 1. sayiyi girin");
        int sayi1 = scanner.nextInt();
        System.out.println("lütfen 2. sayiyi girin");
        int sayi2 = scanner.nextInt();
        int kucukSayi = sayi1 > sayi2 ? sayi2 : sayi1;

        int ebob = 0;
        int ekok = 0;
        for (int i = 1; i <= kucukSayi; i++) {
            if (sayi1 % i == 0 && sayi2 % i == 0) {
                ebob = i;
            }
        }
        ekok = sayi1 * sayi2 / ebob;
        System.out.println("EBOB: " + ebob);
        System.out.println("EKOK: " + ekok);
    }
}