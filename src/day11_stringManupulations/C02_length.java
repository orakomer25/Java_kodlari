package day11_stringManupulations;

import java.util.Scanner;

public class C02_length {
    public static void main(String[] args) {
        String isim =" ramazan uzunkavaklı";

        System.out.println("isim uzunlugu:"+isim.length());
        System.out.println("son harf:"+isim.charAt(isim.length()-1));

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir isim giriniz");
        String ad=scan.nextLine();

        int uzunluk=ad.length();
        if ((uzunluk%2)==0) {
            System.out.println("uzunluk çift,ortadaki iki harf:"+ad.charAt(uzunluk / 2 - 1) + ad.charAt(uzunluk / 2));
        }else {
            System.out.println("uzunluk tek, ortadaki harf:"+ad.charAt((uzunluk-1)/2));
        }

    }
}
