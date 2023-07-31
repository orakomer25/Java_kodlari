package day10_swiitchStatements;

import java.util.Scanner;

public class C01_switchStatements {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Bir Harf giriniz");

        char harf = scan.next().toUpperCase().charAt(0);
        switch (harf){
            case'I':
                System.out.println("International");
                break;
            case 'S':
                System.out.println("Software");
                break;
            case 'T':
                System.out.println("Testing");
                break;
            case 'Q':
                System.out.println("Qualifications");
                break;
            case 'B':
                System.out.println("Board");
            break;
            default:
                System.out.println("Yazdıgınız harf ISTQB' de yok");
        }
    }
}
