package day17_methodOlusturma_methodOverloading;

import java.util.Scanner;

public class C08_sifreKontrolu {
    public static void main(String[] args) {
        //Soru 4 : Main method'da kullanicidan sifre isteyip,
        //          olusturacagimiz bir method'da asagidaki sartlari kontrol edin
        //          ve method'dan true veya false dondurun
        //         ve kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
        //         tum sartlari saglanincaya kadar tekrar deger isteyin
        //         ve sartlar saglaninca , "sifre basariyla kaydedildi" yazdirin
        //         - ilk harf kucuk harf olmali
        //         - son karakter rakam olmali
        //         - sifre bosluk icermemeli
        //         - uzunlugu en az 10 karakter olmali

        boolean sonuc=false;
        int sayac=0;
        while (sonuc==false){
            Scanner scanner = new Scanner(System.in);
            System.out.println("ŞİFRENİZİ OLUŞTURUNUZ");
            String sifre = scanner.nextLine();
            sonuc=sifreKontrol(sifre);

        }
        if (sayac==0){
            System.out.println("Şifreniz Başarı ile Kaydedilmiştir.");
        }

    }//main method sonu
    public static boolean sifreKontrol (String sifre){

        int sayac=0;
        boolean ilkharf=sifre.charAt(0)<'a'||sifre.charAt(0)>'z';
        if (ilkharf){
            System.out.println("ilk harf küçük olmalı");
            sayac++;
        }
        boolean sonKarakter=sifre.charAt(sifre.length()-1)<='9'&&sifre.charAt(sifre.length()-1)>='0';
        if (!sonKarakter) {
            System.out.println("son karakter rakam olmalı");
            sayac++;
        }


        if(sifre.contains(" ")){
            System.out.println("şifre boşluk içermemeli");
            sayac++;
        }
        boolean uzunluk = sifre.length()<10;
        if (uzunluk){
            System.out.println("şifre en az 10 karakter olmalı");
            sayac++;

        }
        if (sayac==0){
            return true;
        }else {
            return false;
        }


    }




}//Class sonu
