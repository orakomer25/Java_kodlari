package day11_stringManupulations;

import java.util.Scanner;

public class C06_mailornek {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen gmail adresini giriniz");
        String mail=scan.nextLine();
        if (!mail.contains("@"))
            System.out.println("Geçersiz mail");
        else if (!mail.contains("@gmail.com")) {
            System.out.println("@gmail.com olmalı");


        } else if (!mail.endsWith("mail.com")) {
            System.out.println("mail de yazım hatası var ");

        }
    }
}
