package day08_ifElseStatements;

import java.util.Scanner;

public class C08_Ornek1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen Aldığınız Ürün Sayısını Giriniz.");
        int urunsayisi = scanner.nextInt();
        System.out.println("Ürünün liste fiyatını giriniz");
        double listefiyati = scanner.nextDouble();
        System.out.println("müşteri kartı var mı? E  veya H");
        char musterikarti=scanner.next().toUpperCase().charAt(0);

        if (musterikarti=='E'){
            if (urunsayisi>=10){
                System.out.println("İNDİRİMLİ FİYAT: "+urunsayisi*(listefiyati-(listefiyati*20/100)));
            }else{
                System.out.println("İNDİRİMLİ FİYAT: "+urunsayisi*(listefiyati-(listefiyati*15/100)));
            }

        }else if (musterikarti=='H'){
            if (urunsayisi>=10){
                System.out.println("İNDİRİMLİ FİYAT: "+urunsayisi*(listefiyati-(listefiyati*15/100)));
            }else {
                System.out.println("İNDİRİMLİ FİYAT: " + urunsayisi * (listefiyati - (listefiyati * 10 / 100)));
            }

        }else System.out.println("HATALI  GİRİŞ");


    }
}
