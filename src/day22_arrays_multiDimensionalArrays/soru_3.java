package day22_arrays_multiDimensionalArrays;

import java.util.Arrays;

public class soru_3 {
    public static void main(String[] args) {
        /*
        Soru 3- Verilen bir array’deki tum elementleri bir saga kaydirip, sondaki elementi de
basa tasiyacak bir method olusturun, array’i yeni haliyle kaydedin.
Orn : input : [4,5,6,7] array’in son hali. : [7,4,5,6]
         */
        int[] sayilar={4,5,6,7,6,7,9,1,5,8};
        int[] yeniSayilar=birSagaKaydir(sayilar);
        System.out.println(Arrays.toString(yeniSayilar));

    }

    public static int[] birSagaKaydir(int[] sayilar) {

        int[] yeniSayilar=new int[sayilar.length];
        for (int i = 0; i < sayilar.length; i++) {
           if (i< sayilar.length-1){

            yeniSayilar[i+1]=sayilar[i];

           }else

           yeniSayilar[0]= sayilar[sayilar.length-1];



        }
        sayilar=yeniSayilar;

        return sayilar;
    }
}
