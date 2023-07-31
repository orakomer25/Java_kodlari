package day08_ifElseStatements;

import java.util.Scanner;

public class C03_IfElseIfStatements {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen Bir Not Giriniz");
        double not=scanner.nextDouble();
        if (not>=85&&not<=100)
            System.out.println("AA");
        else if (not>=70&&not<85) {
            System.out.println("BB");

        } else if (not>=50&&not<70) {
            System.out.println("CC");

        } else if (not>=0&&not<50) {
            System.out.println("DD");


        }else System.out.println("ARALIK DIŞINDA NOT GİRİLDİ");
    }
}
