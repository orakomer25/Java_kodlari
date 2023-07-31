package day18_whileLoop_DoWhileLoop;

import java.util.Scanner;

public class soru_3DoWhileLoop {
    public static void main(String[] args) {
        /*
        Soru 3- Kullanicidan bir pozitif sayi isteyin, sayının tam kare olup olmadığını
        bulunuz, tamkare ise true değilse false yazdırınız.
        Ornek : input : 16, output: 4

         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen Pozitif Bir Tamsayi Giriniz");
        int sayi = scanner.nextInt();
        int bolen=1;
        boolean flag=false;
        do {
            if (sayi==bolen*bolen){
                flag=true;
                break;

            }else
                bolen++;



        }while (bolen<sayi);
        System.out.println(flag);
    }
}
