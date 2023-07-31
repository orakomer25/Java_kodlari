package day13_stringManiplations_forloop;

import java.util.Scanner;

public class soru3 {
    public static void main(String[] args) {

        /*
        Soru 3 : Kullanicidan alinan metindeki istenmeyen rakam ve ozel karakterleri silip,
        sadece ilk harfi buyuk diger harfler kucuk harf yapan bir program yazin.
        input : java1 ogRe2@nMek3 #ne +Gu=zel
        output : Java ogrenmek ne guzel.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir metin giriniz.");
        String girilenmetin = scanner.nextLine();

        String ilkharfBuyuk = girilenmetin.substring(0, 1).toUpperCase() + girilenmetin.substring(1).toLowerCase();

        ilkharfBuyuk = ilkharfBuyuk.replaceAll("\\d", "");
        ilkharfBuyuk = ilkharfBuyuk.replaceAll(" ", "1");
        ilkharfBuyuk = ilkharfBuyuk.replaceAll("\\W", "");
        ilkharfBuyuk = ilkharfBuyuk.replaceAll("1", " ");
        System.out.println(ilkharfBuyuk);


    }
}
