package day08_ifElseStatements;

import java.util.Scanner;

public class C06_Emeklilik {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("CİNSİYETİNİZ E:erkek K:kadın");
        char cinsiyet=scanner.next().toUpperCase().charAt(0);
        System.out.println("YAŞINIZ");
        int yas=scanner.nextInt();
        if (cinsiyet=='K'&&yas>=60){
            System.out.println("Emekli olabilir");

        } else if (cinsiyet=='K'&& yas<60) {
            System.out.println("emeklilik için kalan yıl:"+(60-yas));

        } else if (cinsiyet=='E'&&yas>=65) {
            System.out.println("emekli olabilir");

        } else if (cinsiyet=='E'&&yas<65) {
            System.out.println("emekliliğe kalan yıl: "+(65-yas));

        }

    }
}
