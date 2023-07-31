package day22_arrays_multiDimensionalArrays;

import java.sql.SQLOutput;
import java.util.Arrays;

public class soru1 {
    public static void main(String[] args) {
        /*
        Soru 1- Verilen bir int array’in tum elemanlarini 2 artirip bize donduren bir method
olusturun. Eski array’i yeni haliyle kaydedin.
         */
        int[] arr = {3, 5, 7, 9};
        System.out.println(Arrays.toString(arrayElemani2Artir(arr)));

    }

    public static int[] arrayElemani2Artir(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] +=2;

        }
    return arr;
    }
}
