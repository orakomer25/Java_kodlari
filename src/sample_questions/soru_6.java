package sample_questions;

import java.util.Scanner;

public class soru_6 {
    public static void main(String[] args) {
        /*
        Soru 6-)  Kullanıcıya günde ne kadar çay içtiğini ve ne kadar şeker kullandığını sorun.
 Yılda kaç çay içtigini ve kaç kg şeker kullandığını hesaplayın ve bunları ekranda yazdırın.
 1 şeker = 1.5 gr
1 kg = 1000 gram      olarak hesaplayınç
 Ipuclari:
·        Önce gram cinsinden yıllık ne kadar seker kullandıgını bulun ve kiloya çevirin
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 günde kaç bardak çay içersiniz?");
        double caymiktari= scanner.nextInt();
        System.out.println("1 bardak çay ile kaç şeker tüketirsiniz?");
        double sekermiktari= scanner.nextInt();
        double yillikcaytuketimi=caymiktari*365;
        double yilliksekertuketimi=caymiktari*sekermiktari*365*1.5/1000;
        System.out.println("YILLIK ÇAY TÜKETİMİ "+yillikcaytuketimi);
        System.out.println("YILLIK ŞEKER TÜKETİMİ "+yilliksekertuketimi+" KG");


    }
}
