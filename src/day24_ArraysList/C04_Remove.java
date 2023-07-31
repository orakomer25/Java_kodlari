package day24_ArraysList;

import java.util.ArrayList;
import java.util.List;

public class C04_Remove {
    public static void main(String[] args) {
        List<String > isimler= new ArrayList<>();
        isimler.add("Kaan");
        isimler.add("Bulent");
        isimler.add("Tuğba");
        isimler.add("Burhan");
        System.out.println(isimler);

        isimler.remove("hasan");//false
        isimler.remove("Burhan");//true

        System.out.println(isimler.remove(1));//Bulent

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(7);
        sayilar.add(1);
        System.out.println(sayilar);//[3,5,7,1]
        sayilar.remove(1);
        System.out.println(sayilar);//[3,7,1]
        // ben ille de element olan 1 i silmek istersem
        Integer silinecekElement =1;
        System.out.println(sayilar.remove(silinecekElement));//true
        System.out.println(sayilar);

        sayilar.clear();//tertemiz eder
        System.out.println(sayilar);//[]



    }
}
