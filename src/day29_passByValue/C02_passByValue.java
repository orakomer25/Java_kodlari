package day29_passByValue;

public class C02_passByValue {
    public static void main(String[] args) {
        int sayi = 10;
        //int sayi=20;
       // String sayi="40";
        method1(5);
        System.out.println("method 1 çalıştıktan sonra main deki sayi : "+sayi);
        method2(7);


    }
    public static void method1(int sayi){
        System.out.println("method1 deki sayi : "+sayi);
        sayi=20;
        System.out.println("method1 de değiştirilen sayi : "+sayi);
    }
    public static void method2 (int suha){
        System.out.println("method 2 deki suha ismindeki sayı: "+suha);
    }
}
