package day45_Maps;

import day44_maps.MethodDeposu;

import java.util.Map;

public class C03_Update {
    public static void main(String[] args) {
        Map<Integer,String> ogrenciMap= MethodDeposu.ogrenciMapOlustur();
        System.out.println(ogrenciMap);
        //{101=Ali-Can-11-H-MF, 102=Veli-Cem-10-K-TM, 103=Ali-Cem-11-K-TM, 104=Ayse-Can-10-H-MF, 105=Sevgi-Cem-11-M-TM, 106=Sevgi-Can-10-K-MF}
        //TM yzn bolümü EA olarak değiştir
        ogrenciMap=MethodDeposu.ogrenciBolumDegistir(ogrenciMap,"TM","EA");
        System.out.println(ogrenciMap);




    }
}
