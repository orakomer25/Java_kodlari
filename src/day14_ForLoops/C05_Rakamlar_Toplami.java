package day14_ForLoops;

import java.util.Scanner;

public class C05_Rakamlar_Toplami {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tamsayı giriniz");
        int girilensayi=scanner.nextInt();

        int sayi=girilensayi;
        int birlerbasamagi=0;
        int rakamlartoplami =0;

        int basamaksayisi=(sayi+"").length();


        for (int i = 1; i <=basamaksayisi ; i++) {
            birlerbasamagi=sayi%10;
            rakamlartoplami+=birlerbasamagi;
            sayi/=10;


        }
        System.out.println(rakamlartoplami);
    }
}
