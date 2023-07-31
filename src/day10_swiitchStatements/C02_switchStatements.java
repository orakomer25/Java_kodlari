package day10_swiitchStatements;

import java.util.Scanner;

public class C02_switchStatements {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen bir gün numarası giriniz");
        int gun =scanner.nextInt();
        switch (gun){
            case 1:

            case 2:

            case 3:

            case 4:

            case 5:
                System.out.println("Hafta içi");

                break;
            case 6:
            case 7:
                System.out.println("Hafta sonu");
                break;
            default:
                System.out.println("yanlış deger girdiniz");

        }
    }
}
