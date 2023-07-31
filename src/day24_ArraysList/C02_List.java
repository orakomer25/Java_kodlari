package day24_ArraysList;

import java.util.ArrayList;
import java.util.List;

public class C02_List {
    public static void main(String[] args) {
        List<String> isimler = new ArrayList<>();
        ArrayList<String> isimler2 = new ArrayList<>();
        System.out.println(isimler);
        isimler.add("burhan");
        isimler.add("şeref");
        isimler.add("gülşah");
        System.out.println(isimler);
        isimler.add(2, "nergiz");
        System.out.println(isimler);
        isimler.add(1, "ömer");
        isimler.addAll(2, isimler);
        System.out.println(isimler);
    }
}
