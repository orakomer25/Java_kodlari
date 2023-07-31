package day07_ifStatements;

import java.util.Scanner;

public class C08_IfElseStatements {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("lütfen üçgenin kenarlarını giriniz");

        double kenar1= scanner.nextDouble();
        double kenar2= scanner.nextDouble();
        double kenar3= scanner.nextDouble();

        if (kenar1==kenar2&&kenar1==kenar3&&kenar1>0){
            System.out.println("EŞKENAR UCGEN");
        } else {

            System.out.println("EŞKENAR ÜÇGEN DEĞİL");
        }
    }
}
