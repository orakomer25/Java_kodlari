package day43_Collections;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class C04_HashSet_TreeSet {
    public static void main(String[] args) {
        /*
        Soru : Bir HashSet ve TreeSet olusturun.
         Bir loop ile bu set’lere element ekleyip sureleri karsilastirin.
         */
        HashSet<Integer> hashSet=new HashSet<>();
        TreeSet<Integer> treeSet=new TreeSet<>();
        Random random = new Random();
        int hasBas= LocalTime.now().getNano();
        for (int i = 0; i <100000 ; i++) {
            hashSet.add(random.nextInt(1000));

        }
        int hasBit=LocalTime.now().getNano();
        System.out.println("Has set süresi:"+(hasBit-hasBas));
        int treeBas=LocalTime.now().getNano();
        for (int i = 0; i <100000 ; i++) {
            treeSet.add(random.nextInt(1000));

        }
        int treeBit=LocalTime.now().getNano();
        System.out.println("Tree set süresi:"+(treeBit-treeBas));
    }
}
