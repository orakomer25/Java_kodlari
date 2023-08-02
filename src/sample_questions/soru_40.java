package sample_questions;

import java.util.Arrays;

public class soru_40 {
    public static void main(String[] args) {
        /*
        Soru 40-)
Parametre olarak 2 Int Array kabul eden ve 2 Array listesini yeni bir Arraye ekleyen ve yazdıran bir method yazın.
		 * Input1={1,2,3,4}
		 * Input2={5,6}
		 * Çıktı={1,2,3,4,5,6}
         */
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {5, 6};
        arrayBirlestir(arr1, arr2);
    }

    public static void arrayBirlestir(int[] arr1, int[] arr2) {
        int uzunluk = arr1.length + arr2.length;
        int[] arrBirleşim = new int[uzunluk];
        for (int i = 0; i < arr1.length; i++) {
            arrBirleşim[i] = arr1[i];

        }
        for (int i = 0; i < arr2.length; i++) {
            arrBirleşim[arr1.length + i] = arr2[i];

        }
        System.out.println(Arrays.toString(arrBirleşim));
    }
}
