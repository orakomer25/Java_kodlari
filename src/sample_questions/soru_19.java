package sample_questions;

import java.util.Scanner;

public class soru_19 {
    public static void main(String[] args) {
        /*
        Soru 19-)  Method Sorusu
   Kullanıcıdan doğum tarihini alınız. Burcunu hesaplayan bir method yazınız.
  ipucu:
  Switch Case kullanabilirsiniz. Veya Method yazarak Method aracılıgı ile de yapabilirsiniz.
*/
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan doğum günü bilgisini alın
        System.out.print("Doğum gününüzün günü kaçıncı gün?: ");
        int gun = scanner.nextInt();

        System.out.print("Doğum gününüzün ayı kaçıncı ay?: ");
        int ay = scanner.nextInt();

        System.out.print("Doğum yılınızı girin: ");
        int yil = scanner.nextInt();

        burcHesaplama(gun,ay);

    }

    public static void burcHesaplama(int gun, int ay) {
        String burc = "";
        switch (ay) {
            case 1:
                burc = gun >= 21 ? "KOVA BURCU" : "OĞLAK BURCU";//Kova Burcu 21 Ocak – 19 Şubat
                break;
            case 2:
                burc = gun >= 20 ? "BALIK BURCU" : "KOVA BURCU"; //Balık Burcu 20 Şubat – 20 Mart
                break;
            case 3:
                burc = gun >= 21 ? "KOÇ BURCU" : "BALIK BURCU";// Koç Burcu 21 Mart- 20 Nisan
                break;
            case 4:
                burc = gun >= 21 ? "BOĞA BURCU" : "KOÇ BURCU";//Boğa Burcu 21 Nisan – 20 Mayıs
                break;
            case 5:
                burc = gun >= 21 ? "İKİZLER BURCU" : "BOĞA BURCU";//İkizler Burcu 21 Mayıs – 21 Haziran
                break;
            case 6:
                burc = gun >= 22 ? "YENGEÇ BURCU" : "İKİZLER BURCU";//Yengeç Burcu 22 Haziran – 22 Temmuz
                break;
            case 7:
                burc = gun >= 23 ? "ASLAN BURCU" : "YENGEÇ BURCU";//Aslan Burcu 23 Temmuz – 23 Ağustos
                break;
            case 8:
                burc = gun >= 24 ? "BAŞAK BURCU" : "ASLAN BURCU";//Başak Burcu 24 Ağustos – 23 Eylül
                break;
            case 9:
                burc = gun >= 24 ? "TERAZİ BURCU" : "BAŞAK BURCU";//Terazi Burcu 24 Eylül – 23 Ekim
                break;
            case 10:
                burc = gun >= 24 ? "AKREP BURCU" : "TERAZİ BURCU";//Akrep Burcu 24 Ekim – 22 Kasım
                break;
            case 11:
                burc = gun >= 23 ? "YAY BURCU" : "AKREP BURCU";//Yay Burcu 23 Kasım – 21 Aralık
                break;
            case 12:
                burc = gun >= 22 ? "OĞLAK BURCU" : "YAY BURCU";//Oğlak Burcu 22 Aralık – 20 Ocak
                break;
        }
        System.out.println("Burcunuz : "+burc);
    }

}
