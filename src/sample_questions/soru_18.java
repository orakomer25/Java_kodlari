package sample_questions;

import java.sql.SQLOutput;
import java.util.Scanner;

public class soru_18 {
    public static void main(String[] args) {
        /*
        Soru 18-) Method Sorusu
Girilen araç hızı ve yol kilometresinden, gidilen yere varış süresini hesaplayan bir method yazalım.
Kullanıcıya hızını ve kilometreyi soralım, bunu methoda gönderelim ve bize varış süremizi hesaplasın
İpucu:
yol=Hız*zaman

         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen mesafeyi  Km olarak giriniz.");
        double mesafe= scanner.nextDouble();
        System.out.println("lütfen hızınızı giriniz");
        int hiz= scanner.nextInt();
        double varissuresi= varisSuresiHesapla(mesafe,hiz);
        int saat=(int)varissuresi;
        int dakika=(int)((varissuresi-saat)*60);

        System.out.println("Varış Süreniz: "+saat+" saat "+dakika+" dakika'dır.");
    }

    public static double varisSuresiHesapla(double mesafe, int hiz) {
        double varisSuresi=mesafe/hiz;
        return varisSuresi;
    }
}
