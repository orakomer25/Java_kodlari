package sample_questions;

import java.util.Scanner;

public class soru_14 {
    public static void main(String[] args) {
        /*
        Soru 14-)
Kullanıcıdan bir isim ve bir karakter girmesini isteyin, ardından isimde karakterin kaç kez tekrarlandığını kontrol edelim.
Örnek:
char ch1=            'a'
String name =     "Ali bakkala geç gitti."
Beklenen Çıktı=    a sayısı = 3
Ipucu:
Loop döngülerini hatırlayalım. While döngüsü kullanabilirsiniz!
Sayac adlı bir int variable oluşturarak bunun ile kelimenin kaç defa geçtigini Loop içindeki İf ile bulabilirsiniz!

         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen bir cümle giriniz.");
        String cumle= scanner.nextLine();
        System.out.println("Lütfen bir karakter giriniz");
        char karakter=scanner.next().charAt(0);
        int index=cumle.indexOf(karakter);
        int sayac=0;
        if (index==-1){
            System.out.println("hiç geçmemiştir");
        }else {

            do {
                index = cumle.indexOf(karakter, index + 1);
            sayac++;
            } while (index >= 0);
            System.out.println("SAYAÇ : "+sayac);
        }

    }
}
