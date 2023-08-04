package sample_questions;

public class Soru_42 {
    public static void main(String[] args) {
        /*
        Soru 42
Biri parametreli, diğeri parametresiz 2 constructor oluşturun.
Bu const. kullanarak en az 2 nesne oluşturun ve konsolda bu nesnelerin özellikleri yazdırın
Ipucu: Constructor konusunu pratik yapalım. Nesnelerin rengini adını sayısını gönderelim sonra cagırıp konsolda yazdıralım.

         */
        Soru_42 obj1 = new Soru_42("nesne","mavi",23);
        Soru_42 obj2= new Soru_42();

    }
    Soru_42(String ad,String renk,int sayi){
        System.out.println("Ad : "+ad+" \nRenk : "+renk+" \nSayi : "+sayi);


    }
    Soru_42(){
        System.out.println("deger yok");
    }

}
