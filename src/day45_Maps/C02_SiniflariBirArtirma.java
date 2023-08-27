package day45_Maps;

import day44_maps.MethodDeposu;

import java.util.Map;

public class C02_SiniflariBirArtirma {
    public static void main(String[] args) {
        //ogrenci map in de sınıfları 1 artıralım
        //12. sınıflara mezun yazalım
        Map<Integer,String> ogrenciMap= MethodDeposu.ogrenciMapOlustur();
        System.out.println(ogrenciMap);
        ogrenciMap=MethodDeposu.yilSonuSinifArtir(ogrenciMap);
        System.out.println(ogrenciMap);

    }
}
