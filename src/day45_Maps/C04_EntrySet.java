package day45_Maps;

import day44_maps.MethodDeposu;

import java.util.Map;
import java.util.Set;

public class C04_EntrySet {
    public static void main(String[] args) {
        Map<Integer,String> ogrenciMap= MethodDeposu.ogrenciMapOlustur();
        System.out.println(ogrenciMap);
        Set<Map.Entry<Integer,String>>ogrenciEntrySet =ogrenciMap.entrySet();
        //sınıf artırma sorusunu entry ile yapalım

        for (Map.Entry<Integer,String> eachEntry:ogrenciEntrySet
             ) {
            System.out.println(eachEntry);
          String eachValue=  eachEntry.getValue();
          String[] valueArr=eachValue.split("-");
            switch (valueArr[2]){
                case "9":
                    valueArr[2]="10";
                    break;
                case "10":
                    valueArr[2]="11";
                    break;
                case "11":
                    valueArr[2]="12";
                    break;
                case "12":
                    valueArr[2]="Mezun";
                    break;
            }
            String yeniValue=valueArr[0]+"-"+valueArr[1]+"-"+valueArr[2]+"-"+valueArr[3]+"-"+valueArr[4]+"-";
            eachEntry.setValue(yeniValue);

        }
        System.out.println(ogrenciMap);
    }
}
