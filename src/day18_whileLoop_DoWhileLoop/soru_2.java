package day18_whileLoop_DoWhileLoop;

import java.util.Scanner;

public class soru_2 {
    public static void main(String[] args) {
        /*
        Soru 2- While loop kullanarak kullanicidan alinan sayinin rakamlar toplamini bulan
        bir method yazın
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz");
        int sayi = scanner.nextInt();
        int toplam=rakamlarToplami(sayi);
        System.out.println(toplam);
    }

    public static int rakamlarToplami(int sayi) {
       int birlerbasamagi=0;
       int rakamlarToplamı=0;
        while (sayi>0){
            birlerbasamagi=sayi%10;
            rakamlarToplamı+=birlerbasamagi;
            sayi=sayi/10;
        }
        return rakamlarToplamı;
    }
}
