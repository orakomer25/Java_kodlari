package day14_ForLoops;

import java.util.Scanner;

public class soru_9 {
    public static void main(String[] args) {
        /*
        Soru 9 (interview)- Kullanicidan bir String isteyin ve String’i tersten yazdirin.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir metin giriniz");
        String metin = scanner.nextLine();
        int metinUzunlugu = metin.length();
        String tersmetin = "";
        for (int i = metinUzunlugu; i > 0; i--) {
            char sonkarakter = metin.charAt(i - 1);
            tersmetin = tersmetin + sonkarakter;


        }
        System.out.println(tersmetin);
    }
}
