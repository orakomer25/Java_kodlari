package day44_maps;

import java.util.Map;

public class C04_isimSoyisimIleOgrenciBulma {
    public static void main(String[] args) {
        //ogrenciMap inde verilen isim ve soyisim ogrencilerin
        //isim , soyisim,sınıf ve subelerini yazdırın
        Map<Integer,String> ogrenciMap=MethodDeposu.ogrenciMapOlustur();
        MethodDeposu.isimSoyisimIleOgrenciBul(ogrenciMap,"ali","can");
    }
}
