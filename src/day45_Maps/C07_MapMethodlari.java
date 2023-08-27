package day45_Maps;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class C07_MapMethodlari {
    public static void main(String[] args) {
        Map<String,Integer> harfler=new HashMap<>();
        harfler.put("K",25);
        harfler.put("L",10);
        harfler.put("T",5);
        harfler.put("Z",50);
        harfler.put("A",15);
        System.out.println(harfler);//{A=15, T=5, Z=50, K=25, L=10}

        harfler.put("L",40);
        System.out.println(harfler);//{A=15, T=5, Z=50, K=25, L=40}
        System.out.println(harfler.containsKey("Z"));//true
        System.out.println(harfler.containsValue(5));//true

        System.out.println(harfler.getOrDefault("G", 0));
        System.out.println(harfler.getOrDefault("T", 0));

        System.out.println(harfler.replace("F", 90));//null
        System.out.println(harfler);
        System.out.println(harfler.replace("T", 90));
        System.out.println(harfler);

        System.out.println(harfler.replace("A", 20, 30));//false
        System.out.println(harfler.replace("A", 15, 45));
        System.out.println(harfler);

        System.out.println(harfler.replace("X", 20, 30));//false

        System.out.println(harfler.remove("Z"));
        System.out.println(harfler);

        System.out.println(harfler.remove("Y"));
        System.out.println(harfler);

        System.out.println(harfler.remove("T",70));
        System.out.println(harfler);

        System.out.println(harfler.remove("T",90));
        System.out.println(harfler);





    }
}
