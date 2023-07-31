package day18_whileLoop_DoWhileLoop;

import java.util.Scanner;

public class C05_usHesaplama {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen bir sayi giriniz");
        double sayi=scanner.nextDouble();
        System.out.println("lütfen hesaplanacak üssü giriniz");
        int us = scanner.nextInt();
        usHesapla(sayi,us);

    }
    public static void usHesapla(double sayi,int us){
       double sonuc=1;
        while (us>0){
            sonuc*=sayi;
            us--;

        }
        System.out.println("sonuc: "+sonuc);
    }

}
