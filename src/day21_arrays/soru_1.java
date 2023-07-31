package day21_arrays;

import java.util.Arrays;

public class soru_1 {
    public static void main(String[] args) {
        /*
        Soru 1- Verilen bir int array’in tum elemanlarini 2 artirip bize donduren bir method
olusturun. Eski array’i yeni haliyle kaydedin
         */
        int[]sayilar={2,5,8,7,9,11,15,19};
        arrayElemanlari2Artir(sayilar);
        int[] yeniSayilar =sayilar;
        System.out.println(Arrays.toString(yeniSayilar));
    }

    public static int[] arrayElemanlari2Artir(int[] sayilar) {
        for (int i = 0; i < sayilar.length; i++) {
            sayilar[i] +=2;

        }
        return sayilar;
    }

}

