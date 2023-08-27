package day44_maps;

import java.util.Map;

public class C05_KeyIleValueUlasma {
    //numarası verilen ogrencinin isim,soyisim , sınıf ve subesini yazdırın
    public static void main(String[] args) {
        Map<Integer,String> ogrenciMap=MethodDeposu.ogrenciMapOlustur();
        MethodDeposu.keyIleogrenciBilgileriYazdir(ogrenciMap,102);

    }

}
