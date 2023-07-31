package day18_whileLoop_DoWhileLoop;

import java.util.Scanner;

public class soru_4 {
    public static void main(String[] args) {
        /*
        Soru 4- Kullanicidan toplanmak uzere pozitif tamsayilar isteyinKullaniciya bitirmek
        istediginde 0'a basmasini soyleyin
        Kullanici bitirmek istediginde toplam kac adet pozitif tam sayi girdiginive
        bunlarin toplaminin kac oldugunu yazdirin
        Kullanici negatif sayi girerse "negatif sayi kullanamazsiniz " yazdirin bu
        negatif sayiyi sayi adedine ve toplama eklemeyin
         */
        Scanner scanner = new Scanner(System.in);
        boolean flag=true;
        int sayac=0;
        int sayitoplami=0;
        int sayi;

        while (flag) {
            System.out.println("lütfen toplanmak üzere sayilari giriniz.\nbitirmek istediğinizde '0' a basınız");
            sayi = scanner.nextInt();
            if (sayi>0){
                sayitoplami+=sayi;
                sayac++;
            } else if (sayi<0){

                System.out.println("NEGATİF SAYI KULLANAMAZSIN");

            }else {
                flag=false;
                System.out.println(sayac+" sayının toplami: "+sayitoplami );
            }
        }
    }
}
