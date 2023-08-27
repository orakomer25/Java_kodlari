package day45_Maps;

import java.util.HashMap;
import java.util.Map;

public class C08_MapMethodlari {
    public static void main(String[] args) {
        Map<String,Integer> harfler=new HashMap<>();
        harfler.put("K",25);
        harfler.put("L",10);
        harfler.put("T",5);
        harfler.put("Z",50);
        harfler.put("A",15);
        System.out.println(harfler);//{A=15, T=5, Z=50, K=25, L=10}

        System.out.println(harfler.putIfAbsent("L", 30));//10
        System.out.println(harfler);//{A=15, T=5, Z=50, K=25, L=10}

        //T nin value sini 2 katına çıkaralım


        int value =harfler.get("T");
        harfler.put("T",2*value);


        //Z nin değerini 20 artır
        harfler.compute("Z",(k,v)-> v+20);
        System.out.println(harfler);

        //L nin değerini 3 katının 5 fazlası yapın
        harfler.compute("L",(a,b)->3*b+5);
        System.out.println(harfler);

        //map de M yoksa değerini 50 olarak ekleyin
        harfler.putIfAbsent("M",50);
        System.out.println(harfler);

        harfler.computeIfAbsent("S",v->100);
        System.out.println(harfler);

        harfler.computeIfPresent("T",(k,v)->v+1);
        System.out.println(harfler);

    }
}
