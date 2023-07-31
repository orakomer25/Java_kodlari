package day14_ForLoops;

import java.util.Scanner;

public class soru_5 {
    public static void main(String[] args) {
        /*
        Soru 5- Kullanicidan 20’den kucuk bir sayi alip, bu sayinin faktoryel degerini
hesaplayin.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("20 den küçük bir tamsayı giriniz");
        int girilensayi = scanner.nextInt();
        int faktoriyel = 1;
        String konsol = "";
        if (girilensayi > 1 && girilensayi <= 20) {
            for (int i = girilensayi; i > 0; i--) {
                faktoriyel *= i;
                konsol = konsol.concat(i + "*");

            }
            konsol = konsol.substring(0, konsol.length() - 1);
            System.out.println(girilensayi + "!=" + konsol + " = " + faktoriyel);


        } else {
            System.out.println("girilen değer aralık dışında");
        }
    }
}
