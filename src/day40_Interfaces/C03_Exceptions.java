package day40_Interfaces;

import java.util.Scanner;

public class C03_Exceptions {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("lütfen iki tamsayı giriniz...");
        int sayi1= scanner.nextInt();
        int sayi2= scanner.nextInt();

        try {
            System.out.println(sayi1/sayi2);
        } catch (ArithmeticException e) {
            System.out.println("ikinci sayı 0 olamaz");
        }


    }
}
