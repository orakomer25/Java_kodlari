package day24_ArraysList;

import java.util.ArrayList;
import java.util.List;

public class C05_get_set {
    public static void main(String[] args) {
        List<String> isimler= new ArrayList<>();
        isimler.add("Cemil");
        isimler.add("ömer");
        isimler.add("Mertkan");

        isimler.add(2,"Burhan");
        System.out.println(isimler);

        // set()  update eder. var olan elementin değerini değiştirir
        isimler.set(2,"Ayşe");
        System.out.println(isimler);

        System.out.println(isimler.get(2));
    }
}
