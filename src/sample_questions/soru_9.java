package sample_questions;

import java.util.Scanner;

public class soru_9 {
    public static void main(String[] args) {
        /*
        Soru 9-)  Girilen zamanı saniyeye çeviriniz.
               Örnek: 2 saat 3 dakika 10 saniye ==>	 7390 saniye
         Ipucu:
         Saati alıp saniyeye cevirebilirsiniz.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen saat dakika ve saniye olarak giriniz");
        System.out.print("Saat: ");
        int saat= scanner.nextInt();
        System.out.println();
        System.out.print("Dakika: ");
        int dakika=scanner.nextInt();
        System.out.println();
        System.out.print("Saniye: ");
        int saniye = scanner.nextInt();
        System.out.println();
        System.out.println("TOPLAM SANİYE: "+(saat*3600+dakika*60+saniye));
    }
}
