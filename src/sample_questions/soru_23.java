package sample_questions;

public class soru_23 {
    public static void main(String[] args) {
        /*
            Soru 23-)
            Girdi olarak bir tamsayı kabul eden ve
            bu tam sayının faktöriyelini hesaplayan bir method yazın.
            Method bize çıktıyı döndürsün.
            Örnek:
            Girdi: 6
            Çıktı: 6!=65432*1=720
            ipucu: Aldıgınız sayıyı methoda gönderin. Methodun içinde For Loop ile faktöriyelini hesaplayın.
         */
        int tamsayi = 6;
        faktoriyelHesapla(tamsayi);
    }

    public static void faktoriyelHesapla(int tamsayi) {
        int faktoriyel = 1;
        String metin = "";
        for (int i = tamsayi; i > 0; i--) {
            faktoriyel *= i;
            metin += i + "*";
        }
        metin = metin.substring(0, metin.length() - 1);
        System.out.println(tamsayi + "! = " + metin + " = " + faktoriyel);
    }
}
