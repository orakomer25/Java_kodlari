package day13_stringManiplations_forloop;

import java.util.Scanner;

public class soru4 {
    public static void main(String[] args) {
        /*
        Soru 4 : Kullanicidan bir sifre isteyip, asagidaki sartlari kontrol edin ve kullaniciya
        duzeltmesi gereken tum eksikleri soyleyin, eger tum sartlari saglarsa, "sifre
        basariyla kaydedildi" yazdirin
            - ilk harf kucuk harf olmali
            - son karakter rakam olmali
            - sifre bosluk icermemeli
            - uzunlugu en az 10 karakter olmali
         */

        boolean flag=false;
        while (flag==false) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("ŞİFRENİZİ OLUŞTURUNUZ");
            String sifre = scanner.nextLine();
            char ilkharf = sifre.charAt(0);

            if (ilkharf < 'a' || ilkharf > 'z') {
                System.out.println("ilk harf küçük olmalıdır. ");

            } else
                flag = true;
            char sonkarakter = sifre.charAt(sifre.length() - 1);

            boolean sonKarakterRakamMi = Character.isDigit(sonkarakter);

            if (!sonKarakterRakamMi) {

                System.out.println("son karakter rakam olmalı");
                flag = false;

            } else
                flag = true;
            boolean boslukVarmi = sifre.contains(" ");
            if (boslukVarmi) {
                System.out.println("şifre boşluk içermemeli");
                flag = false;
            } else flag = true;
            int uzunluk = sifre.length();
            if (uzunluk > 10) {
                System.out.println("şifre en fazla 10 karakterden oluşmalıdır");
                flag = false;
            } else flag = true;
        }
        if (flag)
            System.out.println("sifre basariyla kaydedildi");
    }

}
