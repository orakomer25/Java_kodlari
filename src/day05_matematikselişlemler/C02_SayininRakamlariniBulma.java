package day05_matematikselişlemler;

import java.util.Scanner;

public class C02_SayininRakamlariniBulma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen 3 basamaklı bir tamsayı giriniz");
        int girilensayi = scanner.nextInt();
        int birler = 0;
        int onlar = 0;
        int yuzler = 0;
        int rakamlarToplami=0;
        birler=girilensayi%10;
        onlar =girilensayi/10%10;
        yuzler=girilensayi/100;
        rakamlarToplami=birler+onlar+yuzler;

        System.out.println("Rakamlar Toplamı:"+rakamlarToplami);

    }




}