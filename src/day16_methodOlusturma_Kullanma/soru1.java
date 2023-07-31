package day16_methodOlusturma_Kullanma;

public class soru1 {
    public static void main(String[] args) {
      /*  Soru 1- Kullanicidan input olarak verilen bir String, baslangic ve bitis indexlerine gore
        baslangic index'i dahil, bitis index'i haric olacak sekilde aradaki harfleri yazdiran
        bir method olusturun.
                - kullanici baslangic degeri olarak, bitis degerinden buyuk bir sayi girerse, hata
        mesaji verin
        - kullanici str'da olan index'lerden daha buyuk bir index girerse hata mesaji
        yazdirin.

       */
        String name ="öznurum ve bahar senam";
        metinDuzenle(name,0,22);

    }//main method sonu
    public  static void metinDuzenle(String metin,int ilkIndex,int sonIndex){
         int uzunluk=metin.length();
        if (ilkIndex>sonIndex){
             System.out.println("ilkIndex sonIndex ten büyük olamaz");
         } else if (sonIndex>uzunluk||ilkIndex>uzunluk) {
            System.out.println("indexler metinden daha uzun olamaz");

         }else {
            String yazmetin="";
            for (int i = ilkIndex; i <sonIndex ; i++) {
                yazmetin+=metin.charAt(i);

            }
            System.out.println(yazmetin);
        }


    }

}//Class sonu
