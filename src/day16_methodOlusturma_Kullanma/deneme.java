package day16_methodOlusturma_Kullanma;

public class deneme {
    public static void main(String[] args) {
        asalSayiAyiklama(100);

    }//main sonu

    public static void asalSayiAyiklama(int deger){
       if (deger<2){
           System.out.println("Asallığa bakılmaz");
       } else if (deger==2) {
           System.out.println("Asal sayı");

       } else
           for (int i = 2; i <deger ; i++) {
               if (deger%i!=0){
                   System.out.println("Asal sayı");
                   break;
               }else System.out.println("Asal sayi değil");
               break;

           }

    }

}//class sonu
