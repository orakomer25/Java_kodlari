package day04_datacasting;

import java.util.Scanner;

public class C04_CharCasting {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen bir ascii degeri giriniz:");
        char girilenKrk=scanner.next().charAt(0);
        System.out.println("Girilen Karakter:"+girilenKrk);
        System.out.println("Girilen karakter'den sonraki 3 karakter:"+(girilenKrk+1)+","+(girilenKrk+2)+","+(girilenKrk+3));

        System.out.println("Girilen Karakter:"+girilenKrk);
        System.out.println("Girilen karakter'den sonraki 3 karakter:"+
                (char)(girilenKrk+1)+","+
                (char)(girilenKrk+2)+","+
                (char)(girilenKrk)+3);

    }
}
