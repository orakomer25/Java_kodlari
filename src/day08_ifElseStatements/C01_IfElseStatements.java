package day08_ifElseStatements;

import java.util.Scanner;

public class C01_IfElseStatements {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen bir karakter giriniz");
        char girilenkarakter = scanner.next().charAt(0);
        if (girilenkarakter >= 'A' && girilenkarakter <= 'Z') {
            System.out.println("GİRİLEN KARAKTER BÜYÜK");
        } else {
            System.out.println("GİRİLEN KARAKTER BÜYÜK HARF DEĞİL");
        }


    }
}