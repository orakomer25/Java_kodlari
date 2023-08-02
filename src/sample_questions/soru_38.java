package sample_questions;

import java.util.Arrays;

public class soru_38 {
    public static void main(String[] args) {
        /*
        Soru-38)
        Bir tamsayı dizisini (Int Array) girdi olarak kabul eden ve
        verilen bu (Arrayden) diziden minimum ve maksimum sayıları yazdıran bir yöntem yazın
Örnek:
Input : {3,2,5,4,1,6}
Output :
min: 1
max: 6
Ipucu: sort yöntemni kullanabilirsiniz.
         */
        int [] arr ={3,2,5,96,87,96,35,44,12,36};
        maxMinimumDegerYazdir(arr);


    }

    public static void maxMinimumDegerYazdir(int[] arr) {
        Arrays.sort(arr);
        System.out.println("Minimum değer : "+arr[0]);
        System.out.println("Maximum değer : "+arr[arr.length-1]);
    }
}
