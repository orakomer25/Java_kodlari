package day14_ForLoops;

import java.util.Scanner;

public class soru_2 {
    public static void main(String[] args) {
        /*
        Soru 2- Kullanicidan pozitif bir tamsayi alin, 1’den girilen sayiya kadar(girilen sayi
dahil) 7 ila bolunebilen sayilari yazdirin.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen bir tamsayı giriniz");
        int girilensayi = scanner.nextInt();
        for (int i = 1; i <= girilensayi; i++) {
            if (i % 7 == 0) {
                System.out.println(i + " ");
            }

        }
    }
}
