package day09_NestedIfElseStatements_Ternary;

import java.util.Scanner;

public class C07_Ternary {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz ");
        double sayi = scanner.nextDouble();
        System.out.println(sayi>0 ? sayi:-1*sayi);

    }
}
