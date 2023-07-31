package day22_arrays_multiDimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class soru_7dinamik {
    public static void main(String[] args) {
        /*
        Soru 7- Verilen bir array’e istenen sayida eleman ekleyip bize donduren bir method yazin,
eski array’e yeni degeri atayin.

         */

        int[] arr={1,35,65,45,85,62};

        arr=istenenSayidaElemanEkle(arr);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] istenenSayidaElemanEkle(int[] arr) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen eklemek istediğiniz eleman sayısını girin");
        int elemanSayisi=scanner.nextInt();
        int uzunluk=arr.length;
        int[] yeniArr=new int[uzunluk+elemanSayisi];


        for (int i = uzunluk; i < yeniArr.length ; i++) {
            System.out.println("lütfen eklemek istediğiniz elemanı girin");
            int eleman=scanner.nextInt();
            yeniArr[i]=eleman;


        }
        for (int i = 0; i <uzunluk ; i++) {
            yeniArr[i]=arr[i];

        }



        return yeniArr;
    }
}
