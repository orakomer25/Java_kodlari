package day20_arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ornek {
    public static void main(String[] args) {
        int[] random={6,-4,12,0,-10};
        Arrays.sort(random);
        System.out.println(Arrays.toString(random));
        int x= 12;
        int y= Arrays.binarySearch(random,x);
        System.out.println(y);
    }
}
