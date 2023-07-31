package day07_ifStatements;

import java.util.Scanner;

public class C06_BagimsizIfCumleleri {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tamsayi giriniz");
        int girilensayi=scanner.nextInt();
        if (girilensayi%3==0||girilensayi%5==0){
            System.out.println("GÜZEL SAYI");
        }
    }
}
