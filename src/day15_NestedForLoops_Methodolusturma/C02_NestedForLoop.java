package day15_NestedForLoops_Methodolusturma;

import java.util.Scanner;

public class C02_NestedForLoop {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Oluşturulacak şeklin satır sayısını girin.");
        int satir= scanner.nextInt();
        System.out.println("sütun sayısını girin");
        int sutun =scanner.nextInt();
        for (int i = 1; i <=satir ; i++) {
            for (int j =1 ; j <=sutun ; j++) {
                System.out.print("*  ");

            }
            System.out.println();
        }
    }
}
