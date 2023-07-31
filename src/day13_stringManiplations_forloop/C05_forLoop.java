package day13_stringManiplations_forloop;

import java.util.Scanner;

public class C05_forLoop {
    public static void main(String[] args) {

        int input=40;
        for (int i = input; i <input+10 ; i++) {

            System.out.print(i+" ");


        }
        System.out.println("");
        Scanner scanner=new Scanner(System.in);
        for (int i = input; i <=100 ; i+=5) {
            System.out.print(i+" ");



        }
        System.out.println("");
        for (int i = 100; i >=0 ; i--) {
            if (i%7==0)
            System.out.print(i+" ");

        }
    }
}
