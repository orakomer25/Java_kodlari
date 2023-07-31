package sample_questions;

import java.util.Scanner;

public class soru4 {
    public static void main(String[] args) {
        /*
    Soru 4-)   SCANNER
    Kullanıcıdan bir sayı alın ve aldiginiz bu sayının küpünün yarısını konsola yazdırin.


        */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        double sayi = scanner.nextDouble();
        double sonuc = sayi * sayi * sayi / 2;
        System.out.println("SONUÇ :" + sonuc);


    }
}
