package day24_ArraysList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_TekrarEdenSayilariSilme {
    public static void main(String[] args) {
        int[] arr={2,4,5,3,2,5,1,5,3,7};
        List<Integer> tekrarsizlist= new ArrayList<>();
        System.out.println(tekrarsizlist);
        for (int i = 0; i < arr.length ; i++) {
            if (!tekrarsizlist.contains(arr[i])){
              tekrarsizlist.add(arr[i]) ;
            }

        }
        System.out.println(tekrarsizlist);
        arr= new int[tekrarsizlist.size()];
        for (int i = 0; i < arr.length ; i++) {
            arr[i]=tekrarsizlist.get(i);

        }
        System.out.println(Arrays.toString(arr));
    }
}
