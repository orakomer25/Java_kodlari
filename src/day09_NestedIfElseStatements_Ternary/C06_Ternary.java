package day09_NestedIfElseStatements_Ternary;

import java.util.Scanner;

public class C06_Ternary {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen iki sayı giriniz");
        double sayi1=scanner.nextDouble();
        double sayi2=scanner.nextDouble();
        System.out.println(sayi1>sayi2?sayi2:sayi1);
    }
}
