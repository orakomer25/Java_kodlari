package sample_questions;

import java.util.Scanner;

public class soru2 {
    public static void main(String[] args) {
        /*
        Soru-2)   SOUT/SYSO
        Dikdortgenin alanini ve cevresini hesaplayan kodu yaziniz.
        Ipuclari:
        * Dikdortgenin Cevresi: 2 * (uzun kenar + kisa kenar)
        * Dikdortgenin Alani : uzun kenar * kisa kenar
         */
        Scanner scanner =new Scanner(System.in);
        System.out.println("Lütfen dikdörtgenin kenar uzunluklarını giriniz");
        double kenar1=scanner.nextDouble();
        double kenar2= scanner.nextDouble();
        double dikdortgeninAlanı=kenar1*kenar2;
        double dikdortgeninCevresi=2*(kenar1+kenar2);
        System.out.println("DİKDÖRTGENİN ALANI  : "+dikdortgeninAlanı);
        System.out.println("DİKDÖRTGENİN ÇEVRESİ: "+dikdortgeninCevresi);

    }
}
