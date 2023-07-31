package day16_methodOlusturma_Kullanma;

import java.util.Scanner;

public class soru3 {
    public static void main(String[] args) {
        /*
        Soru 3- Kullanicidan main method icinde pozitif bir tamsayi alin. Girilen sayinin asal sayi
        olup olmadigini kontrol edip, sonuc olarak “asal sayi” veya “asal sayi degil”
        sonuclarini donduren bir method olusturun.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("lüğtfen bir sayı giriniz");
        int sayi=scanner.nextInt();
        System.out.println(asalSayiMi(sayi));
    }//main method sonu
    public static boolean asalSayiMi(int sayi){
       boolean flag=true;
        for (int i = 2; i <sayi ; i++) {
            if (sayi==2){
                flag=true;
            } else if (sayi%i==0) {
                flag=false;
                break;

            }else {
                flag = true;            }



        }
        return flag;
    }

}//Class sonu
