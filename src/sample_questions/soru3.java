package sample_questions;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class soru3 {
    public static void main(String[] args) {



    /*
    Soru 3-)   SCANNER
    Kullanicidan 5 tane sayi alin,alinan bu sayilarin ortalamasini hesaplayan java kodunu yaziniz.
     */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen 5 tane sayi giriniz");
        System.out.print("1.Sayı: ");
        double sayi1 = scanner.nextDouble();
        System.out.print("2.Sayı: ");
        double sayi2 = scanner.nextDouble();
        System.out.print("3.Sayı: ");
        double sayi3 = scanner.nextDouble();
        System.out.print("4.Sayı: ");
        double sayi4 = scanner.nextDouble();
        System.out.print("5.Sayı: ");
        double sayi5 = scanner.nextDouble();
        double ortalama = (sayi1 + sayi2 + sayi3 + sayi4 + sayi5) / 5;
        System.out.println("Sayıların Ortalaması: " + ortalama);

    }
}
