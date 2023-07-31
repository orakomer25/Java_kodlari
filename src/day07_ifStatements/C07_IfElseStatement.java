package day07_ifStatements;

import java.util.Scanner;

public class C07_IfElseStatement {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("lütfen bir not giriniz");

        double not= scanner.nextDouble();
        if (not>=50){
            System.out.println("sınıfı geçtin");
        } else {
            System.err.println("kaldın");
        }
    }
}
