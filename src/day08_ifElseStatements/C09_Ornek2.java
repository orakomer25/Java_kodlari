package day08_ifElseStatements;

import java.util.Scanner;

public class C09_Ornek2 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen Mesafeyi kilometre olarak giriniz");
        double km=scanner.nextDouble();
        System.out.println("lütfen çevirmek istediğiniz birimi giriniz");
        char birim=scanner.next().toUpperCase().charAt(0);

        if (birim=='M'){
            System.out.println("sonuç : "+km*1000+" metre");
        } else if (birim=='C') {
            System.out.println("sonuç :"+km*100000+"cm");

        }else{
            System.out.println("İstediğiniz birim sisteme kayıtlı değil");
        }


    }

    }
