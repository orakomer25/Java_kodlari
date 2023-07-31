package day18_whileLoop_DoWhileLoop;

import java.util.Scanner;

import static day17_methodOlusturma_methodOverloading.C07_WhileLoop.sifreKontrolEt;

public class C01_SifreKontrolu {
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
        boolean sonuc = false;
        Scanner scanner;
        String sifre;

        while (!sonuc){
            scanner = new Scanner(System.in);
            System.out.println("Lutfen sifrenizi giriniz");
            sifre = scanner.nextLine();
            sonuc = sifreKontrolEt(sifre);
        }
        System.out.println("Sifreniz basariyla kaydedildi");
    }
}
