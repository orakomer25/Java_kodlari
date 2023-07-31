package day16_methodOlusturma_Kullanma;

public class soru2 {
    public static void main(String[] args) {

        /*
        Soru 2- Kullanicidan main method icinde ayri ayri isim ve soyismini alin
        Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak sekilde duzenleyip,
        isim bosluk soyisim seklinde bize donduren bir method olusturun
        input : isim : Ali soyisim :YILMAZ. output : Ali Yilmaz
         */
        System.out.println(strinDuzenle("ömer", "orak"));
    }//main method sonu
    public static String strinDuzenle(String isim,String soyisim){
        isim=isim.toUpperCase().charAt(0)+isim.substring(1,isim.length()).toLowerCase();
        soyisim=soyisim.toUpperCase().charAt(0)+soyisim.substring(1,soyisim.length()).toLowerCase();
        String sonhal=isim+" "+soyisim;
        return sonhal;
    }


}//Class sonu
