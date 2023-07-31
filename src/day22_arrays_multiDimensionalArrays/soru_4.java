package day22_arrays_multiDimensionalArrays;

import java.util.Scanner;

public class soru_4 {
    public static void main(String[] args) {
        /*
        Soru 4- Verilen bir array’de istenen bir elemanin var olup olmadigini ve varsa kac kere
kullanildigini yazdiran bir method olusturun
         */
        int[] elemanlar={3,6,5,3,7,8,9,1,3,4,5};
        Scanner scanner= new Scanner(System.in);
        System.out.println("lütfen aranacak değeri giriniz.");
        int aranacakDeger=scanner.nextInt();
        elemanVarMı(elemanlar,aranacakDeger);
    }

    public static void elemanVarMı(int[] elemanlar, int aranacakDeger) {
        int sayac=0;
        for (int i = 0; i < elemanlar.length; i++) {
            if (elemanlar[i]==aranacakDeger){
                sayac++;
            }

        }
        System.out.println(aranacakDeger+" değeri  elemanlar Array'inde "+ sayac+" adet vardır.");
    }
}
