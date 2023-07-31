package day21_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C05_soru {
    public static void main(String[] args) {
        /*
        Soru 5- Kullanicidan array’in boyutunu ve elementlerini alip array’i olusturan ve bize
donduren bir method olusturun
         */

        elementAlArrayOlustur();
    }
    public static void elementAlArrayOlustur(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen Array ın boyutunu giriniz");
        int uzunluk =scanner.nextInt();
        int arr[]=new int [uzunluk];

        for (int i = 0; i<arr.length;i++) {
           scanner=new Scanner(System.in);
            System.out.println("lütfen elementleri girin");
            int element=scanner.nextInt();
            arr[i] +=element;
        }
        System.out.println(Arrays.toString(arr));

    }
}
