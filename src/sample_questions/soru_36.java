package sample_questions;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class soru_36 {
    public static void main(String[] args) {
        /*
        Soru 36-)
 Verilen bir Array dizisindeki ortadaki degeri döndüren bir kod/method yazın.
 ( Yapabilirseniz Dinamik kod yazmaya çalışın, Arrayin uzunlugu degişse de ortadaki elemanı getirsin)
Örnek:
 inputarr[]=   {1,2,3,4,5,6,7}
 output:         4
İpucu:  Arrayin indexini hesaplayarak bulabilirsiniz.
  Kendinizi geliştirme adına sorunun cevabını degişik yollardan yapabilir,
  Arrayi kullanıcıya oluşturabilirsiniz (Öneri..)
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen Array oluşturmak için bir uzunluk giriniz.");
        int uzunluk = scanner.nextInt();
        int sayac=0;
        int[] arr = new int[uzunluk];
        int deger=0;
        while(sayac<uzunluk){
            System.out.println(sayac+1+" . degeri giriniz");
             deger = scanner.nextInt();
             arr[sayac]+=deger;
            sayac++;
        }

        System.out.println("Array : "+Arrays.toString(arr));
       int[] ortaIndex=ortaIndexiBul(arr,uzunluk);
        System.out.print("Orta Index : ");
        System.out.println(Arrays.toString(ortaIndex) );

    }

    public static int[] ortaIndexiBul(int arr[],int uzunluk) {
        int[] ortaIndex1=new int[1];

        if (uzunluk%2==1){
           ortaIndex1[0]= arr[(uzunluk-1)/2];
           return ortaIndex1;
        }else{
            ortaIndex1=new int[2];
           ortaIndex1[0]=arr[uzunluk/2-1];
           ortaIndex1[1]=arr[uzunluk/2];
           return ortaIndex1;
        }

    }
}
