package day08_ifElseStatements;

import java.util.Scanner;

public class C05_IfElseIfStatements {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("LÜtfen boyunuzu giriniz");
        double boy=scanner.nextDouble();
        System.out.println("lütfen kilonuzu giriniz");
        double kilo =scanner.nextDouble();
        double endeks=(kilo*10000)/(boy*boy);
        if (endeks>30){
            System.out.println("OBEZ");

        } else if (endeks>=25&&endeks<=30) {
            System.out.println("KİLOLU");


        } else if (endeks>=20&& endeks<=25) {
            System.out.println("NORMAL");


        } else if (endeks<20) {
            System.out.println("ZAYIF");

        }

    }
}
