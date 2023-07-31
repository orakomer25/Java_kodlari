package sample_questions;

import javax.swing.*;
import java.util.Scanner;

public class Soru_28 {
    public static void main(String[] args) {
        /*
        Soru-28)
Kullanıcının girdiği sayıyı tersine çeviren bir program yazın.
Örnek:
      Sayı: 1238
      Sayının Tersi: 8321
İpucu:  Loop kullanabilirsiniz.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen pozitif bir  tamsayi giriniz.");
        int sayi = scanner.nextInt();
        String tersSayi = "";
        if (!(sayi>=0)) {
            System.out.println("Hatalı giriş yaptınız.\nlütfen Pozitif bir tamsayi giriniz.");
            sayi = scanner.nextInt();
        }

            String sayiStr = Integer.toString(sayi);

            for (int i = sayiStr.length() - 1; i >= 0; i--) {
                tersSayi += sayiStr.charAt(i);
            }
       int intSayi=Integer.parseInt(tersSayi);

        System.out.println(intSayi);
    }
}
