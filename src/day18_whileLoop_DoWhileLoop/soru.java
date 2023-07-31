package day18_whileLoop_DoWhileLoop;

import java.util.Scanner;

public class soru {
    public static void main(String[] args) {
        /*
        Soru : Kullanicidan toplanmak uzere sayilar isteyin toplam 500 den büyük olur
        veya girilen sayi adedi 10 olursa  toplami yazdirin
         */

        Scanner scanner=new Scanner(System.in);
        int sayi;
        int toplam=0;
        int sayac=0;
        System.out.println("lütfen toplanmak üzere sayı giriniz");
        while (toplam<=500&&sayac<10){
            sayi=scanner.nextInt();
            toplam+=sayi;
            sayac+=1;
        }
        if (sayac>=10){
            System.out.println("10 dan fazla sayı giremezsiniz\n" +
                    "TOPLAM :"+toplam);
        } else if (toplam>=500) {
            System.out.println("sayiların toplamı 500 den fazla olunca döngü durur.\n" +
                    "TOPLAM : "+toplam);

        }
    }

}

