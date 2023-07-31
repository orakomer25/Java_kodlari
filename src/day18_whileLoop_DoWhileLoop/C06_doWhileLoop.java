package day18_whileLoop_DoWhileLoop;

import java.util.Scanner;

public class C06_doWhileLoop {
    public static void main(String[] args) {
        // kullanucudan toplamak üzere pozitif sayılar  isteyin
        // kullanıcı işlemi bitirmek için 0 a basmalıdır
        //kullanını sıfıra bastığında kaç sayı girdiğini ve toplamlarını yazdırın

        Scanner scanner;
        int sayac = 0;
        int toplam = 0;
        int girilensayi = 0;//0 harici bir sayı olsun diye;
        /*
        while (girilensayi!=0){
            scanner=new Scanner(System.in);
            System.out.println("lütfen toplanmak üzere sayi giriniz");
            girilensayi= scanner.nextInt();
            if (girilensayi!=0){
                toplam+=girilensayi;
                sayac++;
            }
        }
        System.out.println("girilen "+sayac+"adet sayinin toplami: "+toplam);

*/
        do {
            scanner = new Scanner(System.in);
            System.out.println("lütfen toplanmak üzere sayi giriniz");
            girilensayi = scanner.nextInt();
            if (girilensayi != 0) {
                toplam += girilensayi;
                sayac++;
            }


        } while (girilensayi != 0);
        System.out.println(sayac +" "+toplam);

    }
}
