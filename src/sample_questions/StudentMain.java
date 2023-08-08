package sample_questions;

import java.util.Scanner;

public class StudentMain {


    public static void main(String[] args) {
        /*
        Soru 44-)
StudentMaın adında bir class olusturun,
ögrenci bilgilerini alın.(ad soyad yas cınsiyet okul)

Ardından Student adlı bir class olusturun ve içine parametreli constructor koyun,
bu parametreler Maın classdaki bılgılerı ıstesın.
Bu parametreli constructor icinde kullanıcıya ögrenci bilgilerini doldurtun.
Ardından consolda giriilen bilgileri yazdırın
Ipucu:
Bu soruda iki classa ihtiyacımız olacak.
Birinci main classda ögrenci bilgilerini tanımlayacagımız variablerı olusturacagız.
String isim, int yas, char cinsiyet gibi...
Ardından baska bir class olusturacagız ve bu classa parametrelı bir constructor koyacagız,
bu parametrelı constructor az önce olusturdugumuz classdaki parametreleri kabul edecek sekılde olmalı.
Ardından Main classda, parametreli constructoru olan classtan bir obje olusturacagız ve
tabi ki constructor parametrelı oldugu ıcın bızden parametre yazmamızı ısteycek,
 bızde yukarıda olusturdugumuz variable adlarını ekleyecegız.

         */

        Scanner scanner= new Scanner(System.in);
        System.out.println("lütfen öğrenci ismini giriniz");
        String ogrenciAdi= scanner.nextLine();
        System.out.println("lütfen öğrenci soyadını giriniz");
        String ogrenciSoyAdi= scanner.next();
        scanner.nextLine(); // Boş satırı tüket
        System.out.println("lütfen okul giriniz");
        String okul= scanner.nextLine();
        System.out.println("lütfen cinsiyeti giriniz");
       String cinsiyet=scanner.next();
        System.out.println("lütfen yaşı giriniz");
        int ogrenciYasi= scanner.nextInt();
        Student ogrenciBilgileri=new Student(ogrenciAdi,ogrenciSoyAdi,ogrenciYasi,okul,cinsiyet);
        System.out.println(ogrenciBilgileri);




    }
}
