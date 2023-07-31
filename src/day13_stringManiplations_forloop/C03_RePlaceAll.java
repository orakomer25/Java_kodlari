package day13_stringManiplations_forloop;

import java.util.Scanner;

public class C03_RePlaceAll {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen bir metin giriniz");
        String metin=scanner.nextLine();
        metin=metin.replaceAll("\\d","");
        metin=metin.replace(" ","1");
        metin=metin.replaceAll("\\W","");
        metin=metin.replace("1"," ");
        System.out.println(metin);
    }
}
