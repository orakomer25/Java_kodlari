package day14_ForLoops;

import java.util.Scanner;

public class soru_11 {
    public static void main(String[] args) {
        /*
        Soru 11- Kullanicidan pozitif bir tamsayi isteyip, sayinin asal sayi olup olmadigini
kontrol edin ve sonucu yazdirin
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen bir tamsayı giriniz");
        int sayi = scanner.nextInt();
        boolean flag = true;
        for (int i = 2; i <sayi ; i++) {
            if (sayi%i==0){
               flag=false;
            }

        }if (flag) {
            System.out.println(sayi + " Asal sayıdır.");
        }else System.out.println(sayi+" Asal sayı değildir.");
    }
}
