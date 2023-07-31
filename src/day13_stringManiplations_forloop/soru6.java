package day13_stringManiplations_forloop;

import java.util.Scanner;

public class soru6 {
    public static void main(String[] args) {
        /*
        Soru 6 : Kullanicidan alinan bir String alin, String’in uzunlugu cift sayi ise tam ortasina
        :) ekleyin, String’in uzunlugu tek sayi ise ortadaki harfi silin ve yerine :(
        yazdirin
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen bir cümle giriniz");
        String str = scanner.nextLine();
        int uzunluk = str.length();
        int ortatek = (uzunluk - 1) / 2;
        if (uzunluk % 2 == 0) {
            System.out.println(str.substring(0, uzunluk / 2).concat(":)") + str.substring(uzunluk / 2));
        } else {
            System.out.println(str.replace(str.substring(ortatek, ortatek + 1), ":("));
        }

    }
}
