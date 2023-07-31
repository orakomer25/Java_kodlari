package Practice_day02;

import java.util.Scanner;

public class P03_swap {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen iki sayı giriniz");
        System.out.println("Birinci Sayı");
        double sayi1= scan.nextDouble();
        System.out.println("İkinci Sayı");
        double sayi2= scan.nextDouble();
        sayi1=sayi1+sayi2;
        sayi2=sayi1-sayi2;

        System.out.println("====hokus pokus====");
        System.out.println("sayi1 : "+sayi1);
        System.out.println("sayi2 : "+sayi2);
    }
}
