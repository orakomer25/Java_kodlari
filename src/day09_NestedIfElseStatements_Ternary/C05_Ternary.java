package day09_NestedIfElseStatements_Ternary;

import java.util.Scanner;

public class C05_Ternary {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen üçgenin kenarlarını giriniz");
        double kenar1=scanner.nextDouble();
        double kenar2=scanner.nextDouble();
        double kenar3=scanner.nextDouble();
        System.out.println(kenar1==kenar2&&kenar3==kenar1&&kenar1>=0?"Eşkenar Üçgen":"Eşkenar değil");
    }
}
