package day07_ifStatements;

import java.util.Scanner;

public class ornek1 {

    public static void main(String[] args) {

        // kullancıdan bir karakter isteyin ve
        // büyük olup olmadığını yazdırın

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen bir karakter giriniz");
        char  ch1= scanner.nextLine().charAt(0);
        int karakter=ch1;

        System.out.println(karakter);

        if (karakter>64&&karakter<91){
            System.out.println("KARAKTER BÜYÜK");

        }else {
            System.out.println("karakter küçük ");
        }

    }
}
