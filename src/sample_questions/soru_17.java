package sample_questions;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class soru_17 {
    public static void main(String[] args) {
        /*
        Soru 17-)
        Kullanıcıdan bir isim isteyelim. Bu isim 3 harfli olmalıdır.
        Ardından ismin aynı karakterlere sahip olup olmadığını kontrol edelim.
        İsim aynı karakterlere sahipse konsolda "Dize yinelenen karakterlere sahip"
         değil ise konsolda "Dize benzersiz karakterlere sahip" yazdıralım.
Ipucu:
IF/Else - Ternary kullanabilirsiniz. Harfleri Char ile alıp karşılaştırabilirsiniz.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen üç harfli bir isim giriniz.");
        String isim = scanner.next();
        int uzunluk=isim.length();
        if (uzunluk==3&&!(isim.contains(" "))){
            String sonuc = isim.charAt(0) == isim.charAt(1) && isim.charAt(0) == isim.charAt(2) ?
                    "Aynı karakterlere SAHİP" : "Aynı Karakterlere SAHİP DEĞİL";
            System.out.println(sonuc);
        }else {
            System.out.println("Girilen isim 3 karakterli değil");
        }
    }
}
