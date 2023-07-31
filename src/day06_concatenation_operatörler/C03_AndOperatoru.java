package day06_concatenation_operatörler;

public class C03_AndOperatoru {
    public static void main(String[] args) {

        System.out.println(5>3&&6>4);

        System.out.println(5<3&&6>4);

        System.out.println(5>3&&6<=4);

        System.out.println(5<=3&&6<=4);

        // && operatörü ile bağlanan boolean ifadeler kaç tane olursa
        // olsun  hepsi true ise true
        // biri false ise false

        int sayi= 24;
        System.out.println(sayi%2==0&&sayi%3==0&&sayi%5==0);

        System.out.println(sayi>=0&&sayi<=100);



    }
}
