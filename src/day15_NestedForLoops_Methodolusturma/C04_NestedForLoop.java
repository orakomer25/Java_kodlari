package day15_NestedForLoops_Methodolusturma;

import java.util.Scanner;

public class C04_NestedForLoop {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen satır sayısı girin");
        int satir=scanner.nextInt();


        for (int i = 1; i <=satir ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*  ");

            }
            System.out.println();
        }
    }

}
