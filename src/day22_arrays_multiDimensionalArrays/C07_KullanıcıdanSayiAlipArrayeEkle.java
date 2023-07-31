package day22_arrays_multiDimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class C07_KullanıcıdanSayiAlipArrayeEkle {
    public static void main(String[] args) {
        int[] arr= {3,5,8};
        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen eklenecek sayiyi giriniz");
        int eklenecekSayi= scanner.nextInt();
        arr=C06_arrayeBirElemanEkleme.arrayeBirElemanEkle(arr,eklenecekSayi);
        System.out.println(Arrays.toString(arr));

    }
}
