package sample_questions;

import java.util.Scanner;

public class soru_13 {
    public static void main(String[] args) {
        /*
        Soru 13-)
Char cevap değişkeninin değerini test edelim ve aşağıdaki eylemleri gerçekleştiren bir kod yazalım:
Cevap a ise, konsolda 'İsteğiniz işleniyor' mesajı yazsın
Yanıt b ise, konsolda 'Değerlendirmeniz için yine de teşekkür ederiz' mesajı yazsın
Yanıt c ise 'Üzgünüm şuanda yardımcı olamıyoruz' mesajı,
Yanıtın başka bir değeri için ise 'Geçersiz giriş, lütfen tekrar deneyin!' mesajı yazdırılsın.
Ipucu:
Switch konusunu hatırlayalım!
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen değerlendirmenizi 'a','b','c' olarak giriniz...");
        char secim = scanner.next().charAt(0);
        switch (secim) {
            case 'a':
                System.out.println("İsteğiniz işleniyor.");
                break;
            case 'b':
                System.out.println("Değerlendirmeniz için teşekkür ederiz.");
                break;
            case 'c':
                System.out.println("Üzgünüm şuanda yardımcı olamıyoruz.");
                break;
            default:
                System.out.println("geçersiz giriş, lütfen tekrar deneyiniz.");
                break;
        }
    }
}
