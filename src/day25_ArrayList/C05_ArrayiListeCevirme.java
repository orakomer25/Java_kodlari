package day25_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05_ArrayiListeCevirme {
    public static void main(String[] args) {
        Integer[]arr={1,5,6,4,9,8,7,6,3,2,3,4,5,12,36,25,42};
        // bu aarrayi bir list olarak kaydetin.
        List<Integer> forlist=new ArrayList<>();
        for (int i = 0; i < arr.length ; i++) {
            forlist.add(arr[i]);

        }
        System.out.println(forlist);

        List<Integer> hazirMethodList= Arrays.asList(arr);
        System.out.println(hazirMethodList);
    }
}
