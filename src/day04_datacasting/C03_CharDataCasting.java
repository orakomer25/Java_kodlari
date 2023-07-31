package day04_datacasting;

public class C03_CharDataCasting {
    public static void main(String[] args) {

        char ch1='B';
        int sayi1= ch1;
        System.out.println("ch1:"+ch1);
        System.out.println("sayi1:"+sayi1);
        /*
        char data türü özel bir data türüdür.
        her nekadar char '' içerisinde sayi,harf özel karakter
        alsada ascii tablosundaki sayısal degerleri kullanabilir

        char data türündeki bir variable i matematiksel işllemde kullanırsanız
        ascii tablosundaki degeri ile matematiksel işleme gire


         */

        String str1="java";
        String str2="";
        String str3="Candir";
        System.out.println(str1+str2+str3);//java Candir
        char ch2='a';
        char ch3='b';
        System.out.println(ch2+ch3);
        // verilen integer bir sayının char karşılığını yazdırın
        int karakter =98;
        char asciDegeri=(char)karakter;


        System.out.println("verilen sayinin ascii tablosundaki karşılığı:"+asciDegeri);



    }
}
