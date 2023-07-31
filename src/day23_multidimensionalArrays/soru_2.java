package day23_multidimensionalArrays;

import java.util.Arrays;

public class soru_2 {
    public static void main(String[] args) {
        /*
        Soru 2- Verilen 2 katli bir array’de ayni index’e sahip elementleri toplayip, yeni
olusturacagimiz tek katli bir array’e bu toplamlari atayin.
input : int[][] arr = {{3,4,5}, {2,3,6,7}};
output: [5, 7, 11]
         */
        int[][] arr = {{3,4,5}, {2,3,6,7}};

        int kisaArrayUzunluk=arr[0].length>arr[1].length?arr[1].length:arr[0].length;
        int[] yeniArr=new int[kisaArrayUzunluk];
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < kisaArrayUzunluk; j++) {
                yeniArr[j]=arr[0][j]+arr[1][j];


            }

        }
        System.out.println(Arrays.toString(yeniArr));


    }

}
