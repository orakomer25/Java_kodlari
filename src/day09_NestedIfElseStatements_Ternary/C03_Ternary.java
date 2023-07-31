package day09_NestedIfElseStatements_Ternary;

import java.util.Scanner;

public class C03_Ternary {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen bir tamsayı giriniz");
        int sayi=scanner.nextInt();
        if (sayi%2==0){
            System.out.println("Çift Sayi");
        }else {
            System.out.println("Tek Sayi");
        }
        System.out.println(sayi%2==0?"çiftsayi":"tek sayi");
    }
}
