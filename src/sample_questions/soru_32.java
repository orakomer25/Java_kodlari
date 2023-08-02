package sample_questions;

import java.util.Arrays;
import java.util.Scanner;

public class soru_32 {
    public static void main(String[] args) {
        /*
        Soru 32-)
Kullanıcıdan alacagınız bilgilerle oluşturdugunuz bir Integer Array dizesini Reverse olarak (tersten) yazdırınız.
İpucu:  int arrReverse[] diye bir array oluşturun ve kullancıya oluşturdugunuz arrayi buna tersten assign edin.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen Array için uzunluk giriniz");
        int uzunluk = scanner.nextInt();
        int[] arr = new int[uzunluk];
        int sayac=0;
        int deger1;
        while (sayac<uzunluk){
            System.out.println(sayac+1+". değeri giriniz");
            deger1= scanner.nextInt();
            arr[sayac]=deger1;
            sayac++;


        }
        int [] arrReverse=new int[uzunluk];
        for (int i = arr.length-1; i >=0 ;) {
            for (int j = 0; j <uzunluk ; j++) {

                arrReverse[j]=arr[i];
                i--;

            }


        }
        System.out.println(Arrays.toString(arrReverse));

    }
}
