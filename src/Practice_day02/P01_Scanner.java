package Practice_day02;

import java.util.Scanner;

public class P01_Scanner {
    public static void main(String[] args) {
         /*
1- Kullanıcıdan ad/soyad/yas/mail adresi/şifre bilgileirini alıp
sisteme kaydedildiğini aşağıdaki formatta yazdırın.
 *****       KAYIT BAŞARILI      *****
Adınız: Tarık
Soyadınız: Yiğit
Yaşınız:42
Mail Adresiniz:tarik@yigit.com
Şifreniz: A2e365
şeklinde sistemimize kaydınız başarıyla tamamlanmıştır.
 */

        Scanner scan = new Scanner(System.in);
        //System.out.println("lütfen aşağıdaki bilgileri giriniz");
        //System.out.print("Adınız:");
        //String name=scan.nextLine();
        //System.out.println();
        //System.out.print("Soyadınız:");
        //String surname=scan.nextLine();
        //System.out.println();
        //System.out.print("Yaşınız");
        //int age=scan.nextInt();
        //System.out.println();
        //System.out.print("Email:");
        //String mail=scan.next();
        //System.out.println();
       // System.out.print("Şifreniz:");
        //String pass=scan.next();
      //  System.out.println();
      //  System.out.println("*****   KAYIT BAŞARILI   *****");

    /*
2- Kullanıcıdan üçgenin kenarını ve o kenarın yüksekliğini girmesini isteyerek
üçgenin alanını hesaplayıp yazdırın

     */
        System.out.println("lüfen 1 kenar uzunluğu giriniz");
        double kenar=scan.nextDouble();
        System.out.println("yüksekliği giriniz");
        double yukseklik=scan.nextDouble();
        System.out.println("Üçgenin : "+(kenar*yukseklik)/2);
    }

}
