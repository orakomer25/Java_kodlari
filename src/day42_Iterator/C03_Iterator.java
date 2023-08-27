package day42_Iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C03_Iterator {
    public static void main(String[] args) {
        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(5);
        sayilar.add(23);
        sayilar.add(14);
        sayilar.add(2);
        sayilar.add(8);

        ListIterator lit= sayilar.listIterator();
        System.out.println(sayilar);
        while(lit.hasNext()){
            Integer sayi = (Integer) lit.next();
            lit.set(sayi+2);
        }
        System.out.println(sayilar);
        while (lit.hasPrevious()){
          int sayi= (int) lit.previous();
            System.out.println(sayi+" ");
        }
    }
}
