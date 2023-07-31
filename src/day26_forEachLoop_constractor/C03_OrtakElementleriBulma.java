package day26_forEachLoop_constractor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C03_OrtakElementleriBulma {
    public static void main(String[] args) {
        /*
        Soru 5- Verilen iki array’in elementlerini karsilastirip, ikisinde
        ortak olan elementleri ayri bir liste olarak veren bir program yazin
         */
        int[] arr1={3,5,7,9,11,6,8,3,54,12,35,41};
        int[] arr2={2,3,7,6,5,9,3,5,4,32,54,15,48};
        List<Integer> ortakElemanlar= new ArrayList<>();

        for (int each1:arr1
             ) {
            for (int each2:arr2
                 ) {
                if (each1==each2&&!ortakElemanlar.contains(each1)){
                    ortakElemanlar.add(each1);

                }

            }

        }
        Collections.sort(ortakElemanlar);
        System.out.println(ortakElemanlar);
    }
}
