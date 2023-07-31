package day18_whileLoop_DoWhileLoop;

import java.util.Scanner;

public class soru_3 {
    public static void main(String[] args) {
        /*
        Soru 3- While loop kullanarak verilen bir String’i terse cevirip, bu halini bize
donduren bir method olusturun
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ters Yazdırmak İstediğiniz metni giriniz");
        String metin = scanner.nextLine();
        System.out.println(cevirTerseMetin(metin));
    }

    public static String  cevirTerseMetin(String metin) {
        int uzunluk=metin.length();
        String tersMetin="";

        while(uzunluk>0){
            char sonKarakter=metin.charAt(uzunluk-1);
            tersMetin+=sonKarakter;
            uzunluk--;


        }
        return tersMetin;


    }
}
