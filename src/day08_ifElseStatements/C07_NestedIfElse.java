package day08_ifElseStatements;

import java.util.Scanner;

public class C07_NestedIfElse {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("CİNSİYETİNİZ E:erkek K:kadın");
        char cinsiyet=scanner.next().toUpperCase().charAt(0);
        System.out.println("YAŞINIZ");
        double yas=scanner.nextDouble();
        if (cinsiyet=='E'){
            if (yas<0||yas>100){
                System.out.println("yas aralık dışında");
            } else if (yas>65) {
                System.out.println("emekli olabilir");

            }else {
                System.out.println("emekliliğe kalan yıl: "+(65-yas));
            }
        } else if (cinsiyet=='K') {
            if (yas<0||yas>100){
                System.out.println("yas aralık dışında");
            } else if (yas>60) {
                System.out.println("emekli olabilir");
                
            }else {
                System.out.println("Emekliliğe kalan yıl: "+(60-yas));
            }

        }else {
            System.out.println("cinsiyet hatalı girildi");
        }
    }
}
