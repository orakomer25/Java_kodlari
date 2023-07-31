package day07_ifStatements;

import java.util.Scanner;

public class C04_BagimsizIfCumleleri {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz" );
        int girilensayi=scanner.nextInt();
        if (girilensayi%3==0)
            System.out.println("3 ile bölünebilen sayi ");
        if (girilensayi%5==0)
            System.out.println("5 ile bölünebilen sayi");
        if (girilensayi%3!=0)
            System.out.println("Sayi 3 ile tam bölünemez." );
    }
}
