package day05_matematikselişlemler;

public class C03_increment {
    public static void main(String[] args) {

        int sayi=10;

        sayi*=2;
        sayi+=5;
        System.out.println(sayi);

        sayi=10;
        sayi*=3;
        sayi-=3;
        sayi/=3;
        System.out.println(sayi);

        int a =10;
        // a nın değerini yeni oluşturdugumuz b ye atayıp sonra anın degerini 1 artırın

        int b=a;
        a++;

        System.out.println("a:"+a+"b:"+b);

        a=10;
        a++;
        b=a;
        System.out.println("a:"+a+" b: "+b);




    }
}
