package day44_maps;

import java.util.Map;
import java.util.TreeMap;

public class C02_isimListesi {
    public static void main(String[] args) {
    Map<Integer,String > ogrenciMap=MethodDeposu.ogrenciMapOlustur();
        System.out.println(ogrenciMap);
        MethodDeposu.isimSoyisimListesiYazdir(ogrenciMap);

    }

}
