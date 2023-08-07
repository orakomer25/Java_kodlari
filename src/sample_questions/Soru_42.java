package sample_questions;

public class Soru_42 {

    public static void main(String[] args) {
        /*
        Soru 42
Biri parametreli, diğeri parametresiz 2 constructor oluşturun.
Bu const. kullanarak en az 2 nesne oluşturun ve konsolda bu nesnelerin özellikleri yazdırın
Ipucu: Constructor konusunu pratik yapalım. Nesnelerin rengini adını sayısını gönderelim sonra cagırıp konsolda yazdıralım.

         */
        Soru_42 obj1 = new Soru_42("Deri tulum",10,230,270);
        System.out.println("OBJE 1 :");
        System.out.println("ÜRÜN ADI : "+obj1.urunAdi+"\nÜRÜN ADEDİ : "+obj1.urunAdedi+"\nALIŞ FİYATI : "+obj1.urunAlisFiyati+"\nSATIŞ FİYATI : "+obj1.urunSatisFiyati);
        System.out.println("=================================");
        Soru_42 obj2= new Soru_42();
        System.out.println("OBJE 2 : ");
        System.out.println("ÜRÜN ADI : "+obj2.urunAdi+"\nÜRÜN ADEDİ : "+obj2.urunAdedi+"\nALIŞ FİYATI : "+obj2.urunAlisFiyati+"\nSATIŞ FİYATI : "+obj2.urunSatisFiyati);
    }




    Soru_42(String urunAdi, int urunAdedi, double urunAlisFiyati, double urunSatisFiyati){
        this.urunAdi =urunAdi;
        this.urunAdedi=urunAdedi;
        this.urunAlisFiyati=urunAlisFiyati;
        this.urunSatisFiyati=urunSatisFiyati;




    }
    Soru_42(){


    }



    String urunAdi ="değer girilmemiş ";
    int urunAdedi;
    double urunAlisFiyati;
    double urunSatisFiyati;

}
