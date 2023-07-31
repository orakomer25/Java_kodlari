package day16_methodOlusturma_Kullanma;

import java.util.Scanner;

public class soru4 {
    public static void main(String[] args) {
        /*
        Soru 4- Kullanicidan main method icinde bir tamsayi alin. Girilen sayinin pozitif tam
        bolenleri sayisini bulup bize donduren bir method olusturun.

         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen bir tamsayi giriniz.");
        int sayi = scanner.nextInt();
        System.out.println(bolenSayisi(sayi));

    }
    public static int bolenSayisi(int sayi){
        int sayac=0;
        for (int i = 1; i <=sayi ; i++) {
            if (sayi%i==0){
                sayac++;
            }

        }
        return sayac;
    }
}
