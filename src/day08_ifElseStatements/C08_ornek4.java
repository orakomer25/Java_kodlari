package day08_ifElseStatements;

import java.util.Scanner;

public class C08_ornek4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir tamsayı giriniz");
        int sayi= scanner.nextInt();
        System.out.println("sayi="+sayi);

        if (sayi%2==1||sayi%2==-1){
            if (sayi>0){
                System.out.println("pozitif tamsayi");

            } else if  (sayi<0) {
                System.out.println("negatif tamsayi");

            }
        } else if (sayi%2==0) {
            if (sayi%10==0){
                System.out.println("10'un katı");
            }else {
                System.out.println("10un katı değil");
            }

        }
        System.out.println(sayi%2==0?"Çift Sayi":"Tek Sayi");
    }
}
