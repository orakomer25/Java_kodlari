package day44_maps;

import java.lang.reflect.Array;
import java.util.*;

public class MethodDeposu {
    public static Map<Integer,String> ogrenciMapOlustur(){
        Map<Integer,String> ogrenciMap = new TreeMap<>();
        ogrenciMap.put(101,"Ali-Can-11-H-MF");
        ogrenciMap.put(102,"Veli-Cem-10-K-TM");
        ogrenciMap.put(103,"Ali-Cem-11-K-TM");
        ogrenciMap.put(104,"Ayse-Can-10-H-MF");
        ogrenciMap.put(105,"Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106,"Sevgi-Can-10-K-MF");
       return ogrenciMap;
    }
    public static void isimSoyisimListesiYazdir(Map<Integer,String> ogrenciMap){
       Collection<String> valueCollection = ogrenciMap.values();
        System.out.println("Sıra No     İsim     Soyisim");
        System.out.println("============================");
        int siraNo=1;
       for (String eachValue:valueCollection) {
            String[] valueArr=eachValue.split("-");
            System.out.println(siraNo+"     "+valueArr[0]+"  "+valueArr[1]);
            siraNo++;
        }

    }
    public static void keyIleogrenciBilgileriYazdir(Map<Integer,String> ogrenciMap,int key){
        String ogrenciBilgileri=ogrenciMap.get(key);
        String  arr[]=ogrenciBilgileri.split("-");
        System.out.println("İsim :"+arr[0]+"\nSoyisim :"+arr[1]+"\nSınıf:"+arr[2]+"\nŞube :"+arr[3]+"\nAlan :"+arr[4]);
    }
    public static  void isimSoyisimIleOgrenciBul(Map<Integer,String> ogrenciMap,String isim,String soyisim) {
        Collection<String> valueCollection = ogrenciMap.values();
        int siraNo = 1;
        System.out.println(" Öğrenci Listesi");
        System.out.println("=======================================");
        for (String eachValue : valueCollection) {
            String[] valueArr = eachValue.split("-");
            if (valueArr[0].equalsIgnoreCase(isim) && valueArr[1].equalsIgnoreCase(soyisim)) {
                System.out.println(siraNo + "     " + valueArr[0] + "  " + valueArr[1] + "     " + valueArr[2] + "  " + valueArr[3] );
                siraNo++;
            }
        }
    }
    public  static void sinifSubedekiOgrenciListesiYazdir(Map<Integer,String> ogrenciMap,int sinif,String sube){
        Collection<String> valueCollection = ogrenciMap.values();
        int siraNo=1;
        System.out.println(sinif+" . Sınıf "+sube +" Şubesi Öğrenci Listesi");
        System.out.println("=======================================");
        for (String eachValue:valueCollection) {
            String[] valueArr=eachValue.split("-");
            String sinifStr=sinif+"";
            if (valueArr[2].equals(sinifStr)&&valueArr[3].equalsIgnoreCase("K")) {
                System.out.println(siraNo + "     " + valueArr[0] + "  " + valueArr[1]);
                siraNo++;
            }
        }
    }

    public static Map<Integer, String> yilSonuSinifArtir(Map<Integer, String> ogrenciMap) {
       Set<Integer>ogrenciKeySet= ogrenciMap.keySet();
        for (Integer eachKey:ogrenciKeySet
             ) {
            String eachValue=ogrenciMap.get(eachKey);
            String []valueArr=eachValue.split("-");
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
            ogrenciMap.put(eachKey,yeniValue);
            
        }
        return ogrenciMap;
    }

    public static Map<Integer, String> ogrenciBolumDegistir(Map<Integer, String> ogrenciMap, String eskiBolum, String yeniBolum) {
        Set<Integer> ogrenciKeySet=ogrenciMap.keySet();
        for (Integer eachKey:ogrenciKeySet
             ) {
            String value= ogrenciMap.get(eachKey);
            String[] valueArr=value.split("-");
           if (valueArr[4].equalsIgnoreCase(eskiBolum)){
               valueArr[4]=yeniBolum;
           }
            String yeniValue=valueArr[0]+"-"+valueArr[1]+"-"+valueArr[2]+"-"+valueArr[3]+"-"+valueArr[4]+"-";
           ogrenciMap.put(eachKey,yeniValue);


        }
        return ogrenciMap;
    }
}
