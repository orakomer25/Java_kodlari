package day07_ifStatements;

import java.util.Scanner;

public class C03_BagımsızIfCumleleri {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        System.out.println("lütfen pozitif bir tamsayı giriniz");
        int girilensayi= scanner.nextInt();

        if (girilensayi%5==0){
            System.out.println("GİRİLEN SAYI 5 in tam katııdır");

        }

    }
}
