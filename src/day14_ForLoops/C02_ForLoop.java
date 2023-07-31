package day14_ForLoops;


import java.util.Scanner;

public class C02_ForLoop {
    public static void main(String[] args) {

         /*
    Soru 3- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar
dahil olarak aralarindaki tum sayilarin toplamini yazdirin. Bitis degeri
baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin
     */
        Scanner scanner=new Scanner(System.in);
        System.out.println("başlangıç için bir değer giriniz");
        int baslangic= scanner.nextInt();
        System.out.println("bitiş için bir deger giriniz");
        int bitis=scanner.nextInt();
        if (baslangic>bitis){
            System.out.println("başlangıç degeri bitiş değerinden büyük olamaz ");
        }



    }

}
