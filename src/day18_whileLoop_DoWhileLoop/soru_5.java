package day18_whileLoop_DoWhileLoop;

import java.util.Scanner;

public class soru_5 {
    public static void main(String[] args) {
        /*
        Soru 5- Kullanicidan bir sayi ve hesaplamak istedigi ussunu isteyin. While loop
kullanarak verilen sayinin istenen ussunu hesaplayip yazdiran bir method
olusturun
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen bir sayi giriniz");
        double sayi= scanner.nextDouble();
        System.out.println("lütfen hesaplamak istediğiniz üssü giriniz");
        int us= scanner.nextInt();
        usHesaplama(sayi,us);
    }

    public static void usHesaplama(double sayi,int us) {
        double sonuc=1;
        while(us>0){
            sonuc*=sayi;
            us--;
        }
        System.out.println(sonuc);

    }
}
