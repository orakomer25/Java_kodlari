package day35_inharitance;

public class Btoyota extends Araba {
    Btoyota(){
        System.out.println("Btoyota parametresiz constructor çalıştı.");
    }
    //parent clastaki bazi özellikleri update edebiliriz.
    String marka ="toyota";
    String uretimYeri="toyota araçlar Japonya ve Türkiye de üretilir.";
    String lastik = "tüm toyota araçlar pirelli kullanır";
    String guvenlik ="tüm toyota arçlar güvenliklidir";
    String fren="tüm toyota araçlar fren sistemi iyidir";
}
