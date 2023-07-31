package sample_questions;

import java.util.Scanner;

public class soru5 {
    public static void main(String[] args) {

        /*
        Soru 5-)   SCANNER
Kullanıcıdan karenin kenar uzunluğunu alın. Aldiginiz uzunluklarla karenin alanını ve çevresini hesaplayan kodu yazın.
Ipuclari:
Google yaparak karenin alaninin ve cevresinin nasil bulundugunu ögrenin :-) (edited)
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Karenin kenar uzunluğunu giriniz");
        double kenar = scanner.nextDouble();
        double alan = kenar * kenar;
        double cevre = kenar * 4;
        System.out.println("KARENİN ALANI :" + alan);
        System.out.println("KARENİN ÇEVRESİ :" + cevre);
    }
}
