package sample_questions;

public class soru_34 {
    public static void main(String[] args) {
        /*
        Soru 34-)
Bir String'i parametre olarak kabul eden
ve verilen dizede Stringde bulunan rakamların toplamını yazdıran bir Method yazın.

Örnek
String str : ade1r4d3
Int toplam : 8
İpucu :      Character.isDigit() kullanarak Digitleri alabilir sonra bunları Arraye atabilirsiniz.
                  Ardından loop yardımı ile Integer.valueOf() kullanarak toplama yapabilirsiniz
         */
        String metin = "12ç3ş4p7i6p";
        stringdekiRakamalarıTopla(metin);
    }

    public static void stringdekiRakamalarıTopla(String metin) {
        String rakamlarStr = metin.replaceAll("\\D", "");
        int sayi = Integer.parseInt(rakamlarStr);
        int rakamlarToplami = 0;

        for (int i = 0; i < rakamlarStr.length(); i++) {
            rakamlarToplami += sayi % 10;
            sayi /= 10;


        }
        System.out.println("Metin : " + metin + "\nRakamlar Toplamı : " + rakamlarToplami);

    }
}
