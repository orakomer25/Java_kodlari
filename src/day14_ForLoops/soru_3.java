package day14_ForLoops;

import java.util.Scanner;

public class soru_3 {
    public static void main(String[] args) {
        /*
        Soru 3- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar
dahil olarak aralarindaki tum sayilarin toplamini yazdirin. Bitis degeri
baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen başlangıç değeri girin");
        int baslangic = scanner.nextInt();
        System.out.println("lütfen bitiş değeri girin");
        int bitis = scanner.nextInt();
        int rakamlarToplamı = 0;
        if (baslangic < bitis) {
            for (int i = baslangic; i <= bitis; i++) {
                rakamlarToplamı += i;

            }
            System.out.println(rakamlarToplamı);

        } else System.out.println("Başlangıç değeri bitiş değerinden büyük olamaz.");

    }
}
