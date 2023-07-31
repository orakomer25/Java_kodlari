package sample_questions;

import java.util.Scanner;

public class örnek_soru {
    public static void main(String[] args) {
        /*
        Soru 4-
Kullanicidan gun ismini girmesini isteyin,
girilen gun hafta ici bir gun ise “Simdi calisma zamani tatile ... gun var” seklinde
hafta sonu tatiline kac gun kaldigini yazdirin,
girilen gun hafta sonu ise “Simdi dinlenme zamani” yazdirin.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen günü giriniz");
        String gun=scanner.nextLine();
        gun=gun.toUpperCase();
        if (gun.equals("PAZARTESİ")){
            System.out.println("Şimdi çalışma zamanı tatile 4 gün var");
        } else if (gun.equals("SALI")) {
            System.out.println("Şimdi çalışma zamanı tatile 3 gün var");
            
            
        } else if (gun.equals("ÇARŞAMBA")) {
            System.out.println("Şimdi çalışma zamanı tatile 2 gün var");
            
            
        } else if (gun.equals("PERŞEMBE")) {
            System.out.println("Şimdi çalışma zamanı tatile 1 gün var");
            
        } else if (gun.equals("CUMA")) {
            System.out.println("Şimdi çalışma zamanı yarın tatil");
            
        } else if (gun.equals("CUMARTESİ")||gun.equals("PAZAR")) {
            System.out.println("Şimdi tatil zamanı");
        }else {
            System.out.println("Günü Hatalı Girdiniz");
        }


    }
}
