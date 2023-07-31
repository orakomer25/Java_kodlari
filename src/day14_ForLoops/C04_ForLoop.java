package day14_ForLoops;

import java.util.Scanner;

public class C04_ForLoop {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen 20 den küçük bir sayı giriniz");
        int sayi= scanner.nextInt();
        int faktoriyel=1;
        for (int i = sayi; 0 <i ; i--) {
            faktoriyel *=i;


        }
        System.out.println(sayi+"!="+faktoriyel);
    }
}
