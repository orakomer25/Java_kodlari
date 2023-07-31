package day22_arrays_multiDimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class soru_7 {
    public static void main(String[] args) {
        /*
        Soru 7- Verilen bir array’e istenen bir elemani ekleyip bize donduren bir method yazin,
eski array’e yeni degeri atayin.

         */
        int[] arr={1,35,65,45,85,62};
        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen eklemek için bir değer giriniz");
        int eleman=scanner.nextInt();
        elemanEkle( arr,eleman);

    }

    public static void elemanEkle(int[] arr, int eleman) {
        int uzunluk= arr.length;
        int[]yeniarr=new int [uzunluk+1];
        yeniarr=arr;
        yeniarr[yeniarr.length-1]=eleman;
        arr = yeniarr;
        System.out.println(Arrays.toString(arr));

    }
}
