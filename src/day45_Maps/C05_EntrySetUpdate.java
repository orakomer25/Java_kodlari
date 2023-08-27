package day45_Maps;

import day44_maps.MethodDeposu;

import java.util.Map;
import java.util.Set;

public class C05_EntrySetUpdate {
    public static void main(String[] args) {
        Map<Integer,String> ogrenciMap= MethodDeposu.ogrenciMapOlustur();
        //ogrenciMap teki soyisimleri büyük harf yapalım

        Set<Map.Entry<Integer,String>>ogrenciEntrySet=ogrenciMap.entrySet();
        for (Map.Entry<Integer,String> eachEntry:ogrenciEntrySet
             ) {
            String value=eachEntry.getValue();
            String[] valueArr=value.split("-");
            valueArr[1]=valueArr[1].toUpperCase();
            String yeniValue=valueArr[0]+"-"+valueArr[1]+"-"+valueArr[2]+"-"+valueArr[3]+"-"+valueArr[4]+"-";
            eachEntry.setValue(yeniValue);


        }
        System.out.println(ogrenciMap);
    }
}
