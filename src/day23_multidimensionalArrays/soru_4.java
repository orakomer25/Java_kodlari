package day23_multidimensionalArrays;

public class soru_4 {
    public static void main(String[] args) {
        /*
       Soru 4- Verilen 2 katli bir array’de bulunan tum sayilarin carpinini bize donduren bir
method olusturun.
         */
        int[][] arr = {{3,1,2,4},{1,2},{3,4,5},{10},{2,7}};
       int carpim= tumElemanlariCarp(arr);
        System.out.println("Tüm Elemanların Çarpımı : "+carpim);
    }

    public static int tumElemanlariCarp(int[][] arr) {
        int carpim=1;

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {

                    carpim *= arr[i][j];


            }
        }
        return carpim;
    }
}
