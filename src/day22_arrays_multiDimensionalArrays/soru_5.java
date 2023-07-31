package day22_arrays_multiDimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class soru_5 {
    public static void main(String[] args) {
        /*
        Soru 5- Kullanicidan array’in boyutunu ve elementlerini alip array’i olusturan ve bize
donduren bir method olusturun.
         */
       int[] arr= boyutuElementleriAlArrayOlustur();
        System.out.println(Arrays.toString(arr));




    }

    public static int[] boyutuElementleriAlArrayOlustur() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen Array için bir boyut giriniz.");
        int boyut= scanner.nextInt();
        int[] arr=new int[boyut];
        int deger=0;
        for (int i = 0; i <boyut ; i++) {

            System.out.println(i+1+" . değeri giriniz");
            deger= scanner.nextInt();
            arr[i]=deger;

        }
         return  arr;

    }
}
