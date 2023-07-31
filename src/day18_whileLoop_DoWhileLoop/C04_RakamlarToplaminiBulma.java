package day18_whileLoop_DoWhileLoop;

import java.util.Scanner;

public class C04_RakamlarToplaminiBulma {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("lütfen rakamlar toplamını bulmak istediğiniz sayıyı giriniz");
        int girilensayi=scanner.nextInt();
        int sayi=girilensayi;
        int birlerbasamagi=0;
        int rakamlarToplamı=0;

        while (sayi>0){
            birlerbasamagi=sayi%10;
            rakamlarToplamı+=birlerbasamagi;
            sayi/=10;


        }
        System.out.println("Girilen "+ girilensayi+"'nın rakamlar toplamı:"+rakamlarToplamı);

    }
}
