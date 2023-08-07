package sample_questions;

import java.util.Arrays;
import java.util.Scanner;

public class Soru36_SerefBey {
    public static void main(String[] args) {
        /*
        Soru 36-)
Verilen bir Array dizisindeki ortadaki degeri döndüren bir kod/method yazın.
( Yapabilirseniz Dinamik kod yazmaya çalışın, Arrayin uzunlugu degişse de ortadaki elemanı getirsin)
Örnek:
inputarr[]=   {1,2,3,4,5,6,7}
output:         4
İpucu:  Arrayin indexini hesaplayarak bulabilirsiniz. Kendinizi geliştirme adına sorunun cevabını degişik yollardan yapabilir,
Arrayi kullanıcıya oluşturabilirsiniz (Öneri..)
         */

        int[] arr={1,2,3,4,5,6,7};
        int [] yeniArr={1,8,9,26,54,89,45,63,25,100,};

        //System.out.println(arr[3]);

       // System.out.println("Array in orta elemanı : "+arr[(arr.length-1)/2]);

        //ortaElemaniYazdir(arr);

        //System.out.println("döndürülen sayi : "+ortaElemanıDondur(arr));

        int a =ortaElemanıDondur(arr);

        //System.out.println(a);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Array için bir uzunluk giriniz");
        int uzunluk = scanner.nextInt();
        int [] arrDinamik=new int[uzunluk];
        for (int i = 0; i <uzunluk ; i++) {
            System.out.println(i+1+" . değeri giriniz");
            int deger = scanner.nextInt();
            arrDinamik[i]=deger;
        }
        System.out.println(Arrays.toString(arrDinamik));




        ortaElemaniDinamikYazdir(arrDinamik);


    }

    public static void ortaElemaniDinamikYazdir(int[] arrDinamik) {
        if (arrDinamik.length%2==0){
            System.out.println("orta eleman 1 : "+arrDinamik[+(arrDinamik.length/2)-1]);
            System.out.println("orta eleman 2 : "+arrDinamik[arrDinamik.length/2]);

        }else {
            System.out.println("orta eleman : "+arrDinamik[+(arrDinamik.length-1)/2]);
        }
    }

    public static void ortaElemaniYazdir(int[] arr){
        System.out.println("void method sonucu : "+arr[(arr.length-1)/2]);

    }
    public static int ortaElemanıDondur(int[] arr){
        int sayi=arr[(arr.length-1)/2];
      return sayi;
    }

}
