package day09_NestedIfElseStatements_Ternary;

import java.util.Scanner;

public class C04_Ternary {
    public static void main(String[] args) {
        int input=20;
        //System.out.println(input==0 ? "3 ile tam bölünür" : "3 ile tam bölünmez");
        String sonuc=input==0 ? "3 ile tam bölünür" : "3 ile tam bölünmez";
        System.out.println(sonuc);
        int a=10;
        System.out.println(a>0?"a pozitif":"a pozitif değil");

    }
}
