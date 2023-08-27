package day40_Interfaces;

import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class C04_Exceptions {
    public static void main(String[] args) {
        int toplam = 0;
        int girilenSayi = 0;
        Scanner scanner = new Scanner(System.in);
    /*

             try {
            for (int i = 0; i < 100000; i++) {
                System.out.println("lutfen toplanmak üzere sayi giriniz.");
                girilenSayi = scanner.nextInt();
                toplam+=girilenSayi;
            }
        } catch (InputMismatchException e) {
            char girilenYanlısKarakter=scanner.next().charAt(0);
            if(girilenYanlısKarakter=='q'||girilenYanlısKarakter=='Q'){
                System.out.println("girilen sayıların toplamı : "+toplam);
            }else {
                System.out.println("yanlış input,program sonlandırılıyor.");
                System.exit(0);
            }
        }

     */
        for (int i = 0; i < 100000; i++) {
            try {
                System.out.println("lutfen toplanmak üzere sayi giriniz.");
                girilenSayi = scanner.nextInt();
                toplam += girilenSayi;
            } catch (InputMismatchException e) {
                char girilenYanlısKarakter = scanner.next().charAt(0);
                if (girilenYanlısKarakter == 'q' || girilenYanlısKarakter == 'Q') {
                    System.out.println("girilen sayıların toplamı : " + toplam);
                    break;
                } else {
                    System.out.println("yanlış input");

                }

            }


        }
    }
}