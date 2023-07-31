package day25_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C02_Soru_6 {
    public static void main(String[] args) {
        /*
        Soru 6- verilen  pozitif bir tamsayi alip,
         o tamsayiyi tam bolebilen tum pozitif tamsayilari
         bir liste olarak bize donduren bir method olusturun.
         */
        int tamsayi=20;
        System.out.println(tamBolenleriListele(1345));
    }

    public static List<Integer> tamBolenleriListele(int tamsayi) {
       List<Integer> tambolenler=new ArrayList<>();
        for (int i = 1; i <=tamsayi ; i++) {
            if (tamsayi%i==0){
                tambolenler.add(i);


            }

        }return tambolenler;
    }
}
