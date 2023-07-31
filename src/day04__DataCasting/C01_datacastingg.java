package day04__DataCasting;

public class C01_datacastingg {
    public static void main(String[] args) {
        String str ="java candır";

        String s1 = str;

        //boolean bl2 = 10 kabul etmez

    //boolean bl2 ='s'; kabul etmez
        int sayi2 ='k';
        double dbl1 = sayi2;

        int sayi3=10;
        double dbl2 = 4.5;
        short sh1 = 3;
        byte by1 = 7;

      //  sayi3 = dbl2;

        by1 = (byte)dbl2;

        System.out.println(by1);





    }
}
