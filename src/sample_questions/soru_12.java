package sample_questions;

import java.util.Scanner;

public class soru_12 {
    public static void main(String[] args) {
        /*
        Soru 12-)
Verilen iki sayının toplamını -sıfırdan büyük veya eşit olabilir- hesaplamak ve yazdırmak için bir program oluşturalım
Eğer verilen tamsayıların veya toplamın 10'dan fazla basamağı varsa, "Fazla Yüklenme" yazdıralım
Ipucu:  IF/Else kullanabilirsiniz.
Örnek:
İki tamsayı girin:
25  veya  4567986321453
46   veya 123456
Konsolda Çıktı :
Sayıların toplamı: 71  veya  Fazla Yüklenme

         */
        Scanner scanner = new Scanner(System.in);
        long sayi1 = scanner.nextLong();

        long sayi2 = scanner.nextLong();
        System.out.println(Long.MAX_VALUE);
        String sayiString = Long.toString(sayi1);
        long basamakSayisi = sayiString.length();
        String sayiString2 = Long.toString(sayi2);
        long basamakSayisi2 = sayiString2.length();
        long toplam = sayi1 + sayi2;
        String toplamString = Long.toString(toplam);
        long toplambasamaksayisi = toplamString.length();


        if (basamakSayisi > 10 || basamakSayisi2 > 10 || toplambasamaksayisi > 10) {
            System.out.println("FAZLA YÜKLENME");
        } else {
            System.out.println("Sayıların Toplamı: " + (toplam));
        }

    }
}
