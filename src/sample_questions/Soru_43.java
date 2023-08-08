package sample_questions;

import java.util.Scanner;

public class Soru_43 {
    public static void main(String[] args) {
        /*
        Soru 43-)
  Main methodda ögrenci bilgileri oluşturun ve bu verileri kullanın.
  Changename adında bir method oluşturun,
  parametre olarak öğrenci bilgileri alın ve
  methodda tüm bilgileri değiştirin ve yeni bilgileri ekleyip yazdırın.
  Main Methoddaki Rename methodunu çağırdığımız satırda öğrenci bilgilerini tekrardan yazdırın
  Changesurname adlı bir method oluşturun ,
  bu method lastname'i parametre olarak alsın.
  Methodda kullanıcıya yeni bir lastname sorulsun ve eski lastname degiştirilsin.

         */
        String ogrenciAdi = "ömer";
        String ogrenciSoyAdi = "0rak";
        int okulNosu = 1001;
        int ogrenciYasi = 15;
        System.out.println("Öğrencini Adı     : " + ogrenciAdi + "\nÖğrencinin Soyadı : " + ogrenciSoyAdi + "\nOkul Numarası     : " + okulNosu + "\nÖğrencinin Yaşı   : " + ogrenciYasi);
        System.out.println("___________________________________________________");
        changeName(ogrenciAdi, ogrenciSoyAdi, okulNosu, ogrenciYasi);
        System.out.println("___________________________________________________");
        System.out.println("Öğrencini Adı     : " + ogrenciAdi + "\nÖğrencinin Soyadı : " + ogrenciSoyAdi + "\nOkul Numarası     : " + okulNosu + "\nÖğrencinin Yaşı   : " + ogrenciYasi);
        ogrenciSoyAdi = changeSurname(ogrenciSoyAdi);
        System.out.println("---------------------------------------------------");
        System.out.println("Öğrencini Adı     : " + ogrenciAdi + "\nÖğrencinin Soyadı : " + ogrenciSoyAdi + "\nOkul Numarası     : " + okulNosu + "\nÖğrencinin Yaşı   : " + ogrenciYasi);
    }

    public static String changeSurname(String ogrenciSoyAdi) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen yeni bir soyad giriniz");
        ogrenciSoyAdi = scanner.nextLine();
        return ogrenciSoyAdi;

    }

    public static void changeName(String ogrenciAdi, String ogrenciSoyAdi, int okulNosu, int ogrenciYasi) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen Öğrenci adını giriniz");
        ogrenciAdi = scanner.nextLine();
        System.out.println("lütfen öğrencinin soyadını giriniz");
        ogrenciSoyAdi = scanner.next();
        System.out.println("lütfen okul Numarasını giriniz");
        okulNosu = scanner.nextInt();
        System.out.println("lütfen öğrencinin yaşını giriniz");
        ogrenciYasi = scanner.nextInt();
        System.out.println("Öğrencini Adı     : " + ogrenciAdi + "\nÖğrencinin Soyadı : " + ogrenciSoyAdi + "\nOkul Numarası     : " + okulNosu + "\nÖğrencinin Yaşı   : " + ogrenciYasi);


    }
}
