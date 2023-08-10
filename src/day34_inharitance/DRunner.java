package day34_inharitance;

public class DRunner {
    public static void main(String[] args) {
        Corolla corolla = new Corolla();
        //Corolla class ındaki özellikler
        System.out.println(corolla.uretimYeri);//Sakarya/Türkiye
        System.out.println(corolla.model);//Corolla
        System.out.println(corolla.aku);//inci akü
        System.out.println(corolla.sanziman);//Cvt

        //Btoyoto class ındaki özelliler
        System.out.println(corolla.marka);//toyota
        System.out.println(corolla.lastik);//tüm toyota araçlar pirelli kullanır
        System.out.println(corolla.guvenlik);//tüm toyota arçlar güvenliklidir
        System.out.println(corolla.fren);//tüm toyota araçlar fren sistemi iyidir

        //Araba class ındaki özellikler
        System.out.println(corolla.yakit);//yakıt türü belirtilmedi
        corolla.yakit="Benzin";
        System.out.println(corolla.yakit);//Benzin
        System.out.println(corolla.yil);//1900
        System.out.println(corolla.renk);//renk belirtilmedi



    }
}
