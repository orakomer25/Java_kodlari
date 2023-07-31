package sample_questions;

import java.util.Arrays;
import java.util.Scanner;

public class soru_31 {
    public static void main(String[] args) {
        /*
        Soru 31-)
        Kullanıcıdan Arrayin uzunlugunu isteyin.
        Ardından kullanıcıdan Arrayin elemanlarını girmesini isteyin.
        İpucu:  Önce uzunluk alıp arrayi oluştur daha sonra loop ile kullancııya doldurt
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen Array için uzunluk giriniz");
        int uzunluk = scanner.nextInt();
        int[] arr = new int[uzunluk];
        int sayac=0;
        int deger;
        while (sayac<uzunluk){
            System.out.println(sayac+1+". değeri giriniz");
            deger= scanner.nextInt();
            arr[sayac]=deger;
            sayac++;


        }
        System.out.println("ARRAY : "+Arrays.toString(arr));
    }
}
