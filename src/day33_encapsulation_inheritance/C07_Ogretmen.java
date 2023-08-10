package day33_encapsulation_inheritance;


import java.util.Scanner;

public class C07_Ogretmen {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("lütfen öğrenci adını giriniz.");
        String ogrenciAdi= scanner.nextLine();
       // scanner.nextLine();
        System.out.println("lütfen 1. sınav notunu giriniz");
        int sinav1= scanner.nextInt();
        System.out.println("lütfen 2. sınav notunu giriniz");
        int sinav2= scanner.nextInt();
        C08_Okul obj =new C08_Okul();
        System.out.print("1. Sınav : ");
        System.out.println(obj.setSinav1(ogrenciAdi,sinav1));
        System.out.print("2. Sınav : ");
        System.out.println(obj.setSinav2(ogrenciAdi,sinav2));
        obj.getOrtalama();
    }
}
