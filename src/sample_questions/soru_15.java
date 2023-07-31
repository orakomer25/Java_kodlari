package sample_questions;

import java.util.Scanner;

public class soru_15 {
    public static void main(String[] args) {
        /*
        Soru 15-)
        Kullanıcıdan en az 5 harfli bir kelime alın.
        Alınan kelimenin son 3 harfinin 2 kopyasından oluşan yeni bir String oluşturun ve konsolda yazdırın
        Kullanicidan alinan isim uzunluğu en az 5 değilse yeni bir kelime  girmesini isteyin.
     Ipucu:  For/While/Do Loops konularını ve String Manipulation konularını hatırlayalım!
             oopun içerisinde StringM methodlarından  yararlanalım!
         */
        Scanner scanner = new Scanner(System.in);

        String alinanKelime = "";

        while(!(alinanKelime.length()>=5)){
            System.out.println("Lütfen en az 5 harfli bir kelime giriniz");
            alinanKelime=scanner.next();
        }
            String kopya = alinanKelime.substring(alinanKelime.length() - 3);
            System.out.println(kopya+kopya);



    }
}
