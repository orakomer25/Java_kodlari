package day14_ForLoops;

import java.util.Scanner;

public class soru7 {
    public static void main(String[] args) {
        /*
        Soru 7- Kullanicidan pozitif bir tamsayi alip, rakamlar toplamini yazdirin
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("pozitif bir tamsayı giriniz");
        int sayi= scanner.nextInt();
        String stringsayi=sayi+"";
        int basamaksayisi=stringsayi.length();
        int rakamlarToplamı=0;

        for (int i = 0; i < basamaksayisi; i++) {
         int sonRakam=sayi%10;
         rakamlarToplamı=rakamlarToplamı+sonRakam;
         sayi=sayi/10;

        }
        System.out.println("RAKAMLAR TOPLAMI:"+rakamlarToplamı);
        
    }
}
